package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.ChiDinhTrongCapCuu;
import com.example.demo115_quanhe_dto.repository.ChiDinhTrongCapCuuRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChiDinhTrongCapCuuServiceImp implements ChiDinhTrongCapCuuService{


    ChiDinhTrongCapCuuRepository chiDinhTrongCapCuuRepository;
    public ChiDinhTrongCapCuuServiceImp (ChiDinhTrongCapCuuRepository chiDinhTrongCapCuuRepository){
        this.chiDinhTrongCapCuuRepository = chiDinhTrongCapCuuRepository;
    }

    @Override
    public List<ChiDinhTrongCapCuu> getChiDinhTrongCapCuu() {
        List<ChiDinhTrongCapCuu> chiDinhTrongCapCuus = new ArrayList<>();
        chiDinhTrongCapCuuRepository.findAll().forEach(chiDinhTrongCapCuus::add);
        return chiDinhTrongCapCuus;
    }

    @Override
    public ChiDinhTrongCapCuu getChiDinhTrongCapCuuById(Integer id) {
        return chiDinhTrongCapCuuRepository.findById(id).get();
    }
    @Override
    public ChiDinhTrongCapCuu insert(ChiDinhTrongCapCuu chiDinhTrongCapCuu) {
        return chiDinhTrongCapCuuRepository.save(chiDinhTrongCapCuu);
    }
    @Override
    public ChiDinhTrongCapCuu updateChiDinhTrongCapCuu(Integer id, ChiDinhTrongCapCuu chiDinhTrongCapCuu) {
        ChiDinhTrongCapCuu chiDinhFromDb = chiDinhTrongCapCuuRepository.findById(id).get();
        System.out.println(chiDinhTrongCapCuu.toString());
        chiDinhFromDb.setChiDinhTrongCapCuu(chiDinhTrongCapCuu.getChiDinhTrongCapCuu());
        chiDinhFromDb.setIdCapCuu(chiDinhTrongCapCuu.getIdCapCuu());
        chiDinhTrongCapCuuRepository.save(chiDinhFromDb);
        return chiDinhFromDb;
    }
    @Override
    public void deleteChiDinhTrongCapCuu(Integer id) {
        chiDinhTrongCapCuuRepository.deleteById(id);
    }

}
