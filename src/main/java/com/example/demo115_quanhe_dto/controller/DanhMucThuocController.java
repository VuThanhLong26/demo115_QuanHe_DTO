package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.DanhMucThuoc;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.DanhMucThuocDto;
import com.example.demo115_quanhe_dto.service.DanhMucThuocService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/danhmucthuoc")
public class DanhMucThuocController {

    @Autowired
    private ModelMapper modelMapper;
    DanhMucThuocService danhMucThuocService;

    public DanhMucThuocController(DanhMucThuocService danhMucThuocService) {
        this.danhMucThuocService = danhMucThuocService;
    }
    @GetMapping
    public List<DanhMucThuocDto> getAllDanhMucThuoc() {

        return danhMucThuocService.getDanhMucThuoc().stream().map(danhMucThuoc -> modelMapper.map(danhMucThuoc, DanhMucThuocDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DanhMucThuocDto> getDanhMucThuocById(@PathVariable(name = "id") Integer id) {
        DanhMucThuoc danhMucThuoc = danhMucThuocService.getDanhMucThuocById(id);

        // convert entity to DTO
        DanhMucThuocDto danhMucThuocResponse = modelMapper.map(danhMucThuoc, DanhMucThuocDto.class);

        return ResponseEntity.ok().body(danhMucThuocResponse);
    }

    @PostMapping
    public ResponseEntity<DanhMucThuocDto> insertDanhMucThuoc(@RequestBody DanhMucThuocDto danhMucThuocDto) {

        // convert DTO to entity
        DanhMucThuoc danhMucThuocRequest = modelMapper.map(danhMucThuocDto, DanhMucThuoc.class);

        DanhMucThuoc danhMucThuoc = danhMucThuocService.insert(danhMucThuocRequest);

        // convert entity to DTO
        DanhMucThuocDto danhMucThuocResponse = modelMapper.map(danhMucThuoc, DanhMucThuocDto.class);

        return new ResponseEntity<DanhMucThuocDto>(danhMucThuocResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DanhMucThuocDto> updateDanhMucThuoc(@PathVariable Integer id, @RequestBody DanhMucThuocDto danhMucThuocDto) {

        // convert DTO to Entity
        DanhMucThuoc danhMucThuocRequest = modelMapper.map(danhMucThuocDto, DanhMucThuoc.class);

        DanhMucThuoc danhMucThuoc = danhMucThuocService.updateDanhMucThuoc(id, danhMucThuocRequest);

        // entity to DTO
        DanhMucThuocDto danhMucThuocResponse = modelMapper.map(danhMucThuoc, DanhMucThuocDto.class);

        return ResponseEntity.ok().body(danhMucThuocResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<DanhMucThuoc> deleteDanhMucThuoc(@PathVariable("id") Integer id){
        danhMucThuocService.deleteDanhMucThuoc(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
