package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.BenhAnVanChuyenCapCuu;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.BenhAnVanChuyenCapCuuDto;
import com.example.demo115_quanhe_dto.service.BenhAnVanChuyenCapCuuService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/benhan")
public class BenhAnVanChuyenCapCuuController {

    @Autowired
    private ModelMapper modelMapper;

    BenhAnVanChuyenCapCuuService benhAnVanChuyenCapCuuService;

    public BenhAnVanChuyenCapCuuController(BenhAnVanChuyenCapCuuService benhAnVanChuyenCapCuuService) {
        this.benhAnVanChuyenCapCuuService = benhAnVanChuyenCapCuuService;
    }
    @GetMapping
    public List<BangKeThuocDto> getAllBenhAn() {

        return benhAnVanChuyenCapCuuService.getBenhAnVanChuyenCapCuu().stream().map(benhAn -> modelMapper.map(benhAn, BangKeThuocDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BenhAnVanChuyenCapCuuDto> getBenhAnById(@PathVariable(name = "id") Integer id) {
        BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu = benhAnVanChuyenCapCuuService.getBenhAnVanChuyenCapCuuById(id);

        // convert entity to DTO
        BenhAnVanChuyenCapCuuDto benhAnResponse = modelMapper.map(benhAnVanChuyenCapCuu, BenhAnVanChuyenCapCuuDto.class);

        return ResponseEntity.ok().body(benhAnResponse);
    }

    @PostMapping
    public ResponseEntity<BenhAnVanChuyenCapCuuDto> insertBenhAn(@RequestBody BenhAnVanChuyenCapCuuDto benhAnVanChuyenCapCuuDto) {

        // convert DTO to entity
        BenhAnVanChuyenCapCuu benhAnRequest = modelMapper.map(benhAnVanChuyenCapCuuDto, BenhAnVanChuyenCapCuu.class);

        BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu = benhAnVanChuyenCapCuuService.insert(benhAnRequest);

        // convert entity to DTO
        BenhAnVanChuyenCapCuuDto benhAnResponse = modelMapper.map(benhAnVanChuyenCapCuuDto, BenhAnVanChuyenCapCuuDto.class);

        return new ResponseEntity<BenhAnVanChuyenCapCuuDto>(benhAnResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BenhAnVanChuyenCapCuuDto> updateBenhAn(@PathVariable Integer id, @RequestBody BenhAnVanChuyenCapCuuDto benhAnVanChuyenCapCuuDto) {

        // convert DTO to Entity
        BenhAnVanChuyenCapCuu benhAnRequest = modelMapper.map(benhAnVanChuyenCapCuuDto, BenhAnVanChuyenCapCuu.class);

        BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu = benhAnVanChuyenCapCuuService.updateBenhAn(id, benhAnRequest);

        // entity to DTO
        BenhAnVanChuyenCapCuuDto benhAnResponse = modelMapper.map(benhAnVanChuyenCapCuu, BenhAnVanChuyenCapCuuDto.class);

        return ResponseEntity.ok().body(benhAnResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<BenhAnVanChuyenCapCuu> deleteBenhAn(@PathVariable("id") Integer id){
        benhAnVanChuyenCapCuuService.deleteBenhAn(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
