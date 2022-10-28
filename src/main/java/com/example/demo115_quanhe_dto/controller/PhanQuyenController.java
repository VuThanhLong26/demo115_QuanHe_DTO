package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.PhanQuyen;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.PhanQuyenDto;
import com.example.demo115_quanhe_dto.service.PhanQuyenService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/phanquyen")
public class PhanQuyenController {

    @Autowired
    private ModelMapper modelMapper;
    PhanQuyenService phanQuyenService;

    public PhanQuyenController(PhanQuyenService phanQuyenService) {
        this.phanQuyenService = phanQuyenService;
    }

    @GetMapping
    public List<PhanQuyenDto> getAllPhanQuyen() {

        return phanQuyenService.getPhanQuyen().stream().map(phanQuyen -> modelMapper.map(phanQuyen, PhanQuyenDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhanQuyenDto> getPhanQuyenById(@PathVariable(name = "id") Integer id) {
        PhanQuyen phanQuyen = phanQuyenService.getPhanQuyenById(id);

        // convert entity to DTO
        PhanQuyenDto phanQuyenResponse = modelMapper.map(phanQuyen, PhanQuyenDto.class);

        return ResponseEntity.ok().body(phanQuyenResponse);
    }

    @PostMapping
    public ResponseEntity<PhanQuyenDto> insertPhanQuyen(@RequestBody PhanQuyenDto phanQuyenDto) {

        // convert DTO to entity
        PhanQuyen phanQuyenRequest = modelMapper.map(phanQuyenDto, PhanQuyen.class);

        PhanQuyen phanQuyen = phanQuyenService.insert(phanQuyenRequest);

        // convert entity to DTO
        PhanQuyenDto phanQuyenResponse = modelMapper.map(phanQuyen, PhanQuyenDto.class);

        return new ResponseEntity<PhanQuyenDto>(phanQuyenResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhanQuyenDto> updatePhanQuyen(@PathVariable Integer id, @RequestBody PhanQuyenDto phanQuyenDto) {

        // convert DTO to Entity
        PhanQuyen phanQuyenRequest = modelMapper.map(phanQuyenDto, PhanQuyen.class);

        PhanQuyen phanQuyen = phanQuyenService.updatePhanQuyen(id, phanQuyenRequest);

        // entity to DTO
        PhanQuyenDto phanQuyenResponse = modelMapper.map(phanQuyen, PhanQuyenDto.class);

        return ResponseEntity.ok().body(phanQuyenResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<PhanQuyen> deletePhanQuyen(@PathVariable("id") Integer id){
        phanQuyenService.deletePhanQuyen(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
