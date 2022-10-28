package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.ChiDinhTrongCapCuu;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.ChiDinhTrongCapCuuDto;
import com.example.demo115_quanhe_dto.service.ChiDinhTrongCapCuuService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chidinhcapcuu")
public class ChiDinhTrongCapCuuController {
    @Autowired
    private ModelMapper modelMapper;
    ChiDinhTrongCapCuuService chiDinhTrongCapCuuService;

    public ChiDinhTrongCapCuuController(ChiDinhTrongCapCuuService chiDinhTrongCapCuuService) {
        this.chiDinhTrongCapCuuService = chiDinhTrongCapCuuService;
    }
    @GetMapping
    public List<ChiDinhTrongCapCuuDto> getAllChiDinh() {

        return chiDinhTrongCapCuuService.getChiDinhTrongCapCuu().stream().map(chiDinhTrongCapCuu -> modelMapper.map(chiDinhTrongCapCuu, ChiDinhTrongCapCuuDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChiDinhTrongCapCuuDto> getChiDinhById(@PathVariable(name = "id") Integer id) {
        ChiDinhTrongCapCuu chiDinhTrongCapCuu = chiDinhTrongCapCuuService.getChiDinhTrongCapCuuById(id);

        // convert entity to DTO
        ChiDinhTrongCapCuuDto chiDinhResponse = modelMapper.map(chiDinhTrongCapCuu, ChiDinhTrongCapCuuDto.class);

        return ResponseEntity.ok().body(chiDinhResponse);
    }

    @PostMapping
    public ResponseEntity<ChiDinhTrongCapCuuDto> insertChiDinh(@RequestBody ChiDinhTrongCapCuuDto chiDinhTrongCapCuuDto) {

        // convert DTO to entity
        ChiDinhTrongCapCuu chiDinhRequest = modelMapper.map(chiDinhTrongCapCuuDto, ChiDinhTrongCapCuu.class);

        ChiDinhTrongCapCuu chiDinhTrongCapCuu = chiDinhTrongCapCuuService.insert(chiDinhRequest);

        // convert entity to DTO
        ChiDinhTrongCapCuuDto chiDinhResponse = modelMapper.map(chiDinhTrongCapCuu, ChiDinhTrongCapCuuDto.class);

        return new ResponseEntity<ChiDinhTrongCapCuuDto>(chiDinhResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChiDinhTrongCapCuuDto> updateChiDinh(@PathVariable Integer id, @RequestBody ChiDinhTrongCapCuuDto chiDinhTrongCapCuuDto) {

        // convert DTO to Entity
        ChiDinhTrongCapCuu chiDinhRequest = modelMapper.map(chiDinhTrongCapCuuDto, ChiDinhTrongCapCuu.class);

        ChiDinhTrongCapCuu chiDinhTrongCapCuu = chiDinhTrongCapCuuService.updateChiDinhTrongCapCuu(id, chiDinhRequest);

        // entity to DTO
        ChiDinhTrongCapCuuDto chiDinhResponse = modelMapper.map(chiDinhTrongCapCuu, ChiDinhTrongCapCuuDto.class);

        return ResponseEntity.ok().body(chiDinhResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<ChiDinhTrongCapCuu> deleteChiDinh(@PathVariable("id") Integer id){
        chiDinhTrongCapCuuService.deleteChiDinhTrongCapCuu(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
