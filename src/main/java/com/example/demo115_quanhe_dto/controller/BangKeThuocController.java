package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.service.BangKeThuocService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bangkethuoc")
public class BangKeThuocController {
    @Autowired
    private ModelMapper modelMapper;
    BangKeThuocService bangKeThuocService;

    public BangKeThuocController(BangKeThuocService bangKeThuocService) {
        this.bangKeThuocService = bangKeThuocService;
    }

    @GetMapping
    public List<BangKeThuocDto> getAllBangKeThuoc() {

        return bangKeThuocService.getBangKeThuoc().stream().map(bangKeThuoc -> modelMapper.map(bangKeThuoc, BangKeThuocDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BangKeThuocDto> getBangKeThuocById(@PathVariable(name = "id") Integer id) {
        BangKeThuoc bangKeThuoc = bangKeThuocService.getBangKeThuocById(id);

        // convert entity to DTO
        BangKeThuocDto bangKeThuocResponse = modelMapper.map(bangKeThuoc, BangKeThuocDto.class);

        return ResponseEntity.ok().body(bangKeThuocResponse);
    }





    @PostMapping
    public ResponseEntity<BangKeThuocDto> insertBangKeThuoc(@RequestBody BangKeThuocDto bangKeThuocDto) {

        // convert DTO to entity
        BangKeThuoc bangKeThuocRequest = modelMapper.map(bangKeThuocDto, BangKeThuoc.class);

        BangKeThuoc bangKeThuoc = bangKeThuocService.insert(bangKeThuocRequest);

        // convert entity to DTO
        BangKeThuocDto bangKeThuocResponse = modelMapper.map(bangKeThuoc, BangKeThuocDto.class);

        return new ResponseEntity<BangKeThuocDto>(bangKeThuocResponse, HttpStatus.CREATED);
    }





    @PutMapping("/{id}")
    public ResponseEntity<BangKeThuocDto> updateBangKeThuoc(@PathVariable Integer id, @RequestBody BangKeThuocDto bangKeThuocDto) {

        // convert DTO to Entity
        BangKeThuoc bangKeThuocRequest = modelMapper.map(bangKeThuocDto, BangKeThuoc.class);

        BangKeThuoc bangKeThuoc = bangKeThuocService.updateBangKeThuoc(id, bangKeThuocRequest);

        // entity to DTO
        BangKeThuocDto bangKeThuocResponse = modelMapper.map(bangKeThuoc, BangKeThuocDto.class);

        return ResponseEntity.ok().body(bangKeThuocResponse);
    }

    @DeleteMapping({"/{stt}"})

    public ResponseEntity<BangKeThuoc> deleteBangKeThuoc(@PathVariable("stt") Integer stt){
        bangKeThuocService.deleteBangKeThuoc(stt);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
