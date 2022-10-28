package com.example.demo115_quanhe_dto.controller;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.model.EvenLog;
import com.example.demo115_quanhe_dto.modeldto.BangKeThuocDto;
import com.example.demo115_quanhe_dto.modeldto.EvenLogDto;
import com.example.demo115_quanhe_dto.service.EvenLogService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/evenlog")
public class EvenLogController {
    @Autowired
    private ModelMapper modelMapper;
    EvenLogService evenLogService;

    public EvenLogController(EvenLogService evenLogService) {
        this.evenLogService = evenLogService;
    }


    @GetMapping
    public List<EvenLogDto> getAllEvenLog() {

        return evenLogService.getEvenLog().stream().map(evenLog -> modelMapper.map(evenLog, EvenLogDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EvenLogDto> getEvenLogById(@PathVariable(name = "id") Integer id) {
        EvenLog evenLog = evenLogService.getEvenLogById(id);

        // convert entity to DTO
        EvenLogDto evenLogResponse = modelMapper.map(evenLog, EvenLogDto.class);

        return ResponseEntity.ok().body(evenLogResponse);
    }

    @PostMapping
    public ResponseEntity<EvenLogDto> insertEvenLog(@RequestBody EvenLogDto evenLogDto) {

        // convert DTO to entity
        EvenLog evenLogRequest = modelMapper.map(evenLogDto, EvenLog.class);

        EvenLog evenLog = evenLogService.insert(evenLogRequest);

        // convert entity to DTO
        EvenLogDto evenLogResponse = modelMapper.map(evenLog, EvenLogDto.class);

        return new ResponseEntity<EvenLogDto>(evenLogResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EvenLogDto> updateEvenLog(@PathVariable Integer id, @RequestBody EvenLogDto evenLogDto) {

        // convert DTO to Entity
        EvenLog evenLogRequest = modelMapper.map(evenLogDto, EvenLog.class);

        EvenLog evenLog = evenLogService.updateEvenLog(id, evenLogRequest);

        // entity to DTO
        EvenLogDto evenLogResponse = modelMapper.map(evenLog, EvenLogDto.class);

        return ResponseEntity.ok().body(evenLogResponse);
    }

    @DeleteMapping({"/{id}"})

    public ResponseEntity<EvenLog> deleteEvenLog(@PathVariable("id") Integer id){
        evenLogService.deleteEvenLog(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
