package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.ToDieuTri;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.ToDieuTriDto;
import com.example.demo115_quanhe_dto.service.ToDieuTriService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/todieutri")
public class ToDieuTriController {
    @Autowired
    private ModelMapper modelMapper;
    ToDieuTriService toDieuTriService;

    public ToDieuTriController(ToDieuTriService toDieuTriService) {
        this.toDieuTriService = toDieuTriService;
    }

    @GetMapping
    public List<ToDieuTriDto> getAllToDieuTri() {

        return toDieuTriService.getToDieuTri().stream().map(toDieuTri -> modelMapper.map(toDieuTri, ToDieuTriDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToDieuTriDto> getToDieuTriById(@PathVariable(name = "id") Integer id) {
        ToDieuTri toDieuTri = toDieuTriService.getToDieuTriById(id);

        // convert entity to DTO
        ToDieuTriDto toDieuTriResponse = modelMapper.map(toDieuTri, ToDieuTriDto.class);

        return ResponseEntity.ok().body(toDieuTriResponse);
    }

    @PostMapping
    public ResponseEntity<ToDieuTriDto> insertToDieuTri(@RequestBody ToDieuTriDto toDieuTriDto) {

        // convert DTO to entity
        ToDieuTri toDieuTriRequest = modelMapper.map(toDieuTriDto, ToDieuTri.class);

        ToDieuTri toDieuTri = toDieuTriService.insert(toDieuTriRequest);

        // convert entity to DTO
        ToDieuTriDto toDieuTriResponse = modelMapper.map(toDieuTri, ToDieuTriDto.class);

        return new ResponseEntity<ToDieuTriDto>(toDieuTriResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ToDieuTriDto> updateToDieuTri(@PathVariable Integer id, @RequestBody ToDieuTriDto toDieuTriDto) {

        // convert DTO to Entity
        ToDieuTri toDieuTriRequest = modelMapper.map(toDieuTriDto, ToDieuTri.class);

        ToDieuTri toDieuTri = toDieuTriService.updateToDieuTri(id, toDieuTriRequest);

        // entity to DTO
        ToDieuTriDto toDieuTriResponse = modelMapper.map(toDieuTri, ToDieuTriDto.class);

        return ResponseEntity.ok().body(toDieuTriResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<ToDieuTri> deleteToDieuTri(@PathVariable("id") Integer id){
        toDieuTriService.deleteToDieuTri(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
