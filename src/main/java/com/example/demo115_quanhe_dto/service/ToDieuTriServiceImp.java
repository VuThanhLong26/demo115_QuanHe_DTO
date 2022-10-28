package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.ToDieuTri;
import com.example.demo115_quanhe_dto.repository.ToDieuTriRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDieuTriServiceImp implements ToDieuTriService{

    ToDieuTriRepository toDieuTriRepository;

    public ToDieuTriServiceImp(ToDieuTriRepository toDieuTriRepository) {
        this.toDieuTriRepository = toDieuTriRepository;
    }

    @Override
    public List<ToDieuTri> getToDieuTri() {
        List<ToDieuTri> toDieuTris = new ArrayList<>();
        toDieuTriRepository.findAll().forEach(toDieuTris::add);
        return toDieuTris;
    }
    @Override
    public ToDieuTri getToDieuTriById(Integer id) {
        return toDieuTriRepository.findById(id).get();
    }

    @Override
    public ToDieuTri insert(ToDieuTri toDieuTri) {
        return toDieuTriRepository.save(toDieuTri);
    }


    @Override
    public ToDieuTri updateToDieuTri(Integer id, ToDieuTri toDieuTri) {
        ToDieuTri toDieutriFromDb = toDieuTriRepository.findById(id).get();
        System.out.println(toDieutriFromDb.toString());
        toDieutriFromDb.setIdCapCuu(toDieuTri.getIdCapCuu());
        toDieutriFromDb.setDienBienBenh(toDieuTri.getDienBienBenh());
        toDieutriFromDb.setyLenh(toDieuTri.getyLenh());
        toDieutriFromDb.setNgayGio(toDieuTri.getNgayGio());
        toDieuTriRepository.save(toDieutriFromDb);
        return toDieutriFromDb;
    }
    @Override
    public void deleteToDieuTri(Integer id) {
        toDieuTriRepository.deleteById(id);
    }
}
