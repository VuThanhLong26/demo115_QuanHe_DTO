package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.PhanQuyen;
import com.example.demo115_quanhe_dto.repository.PhanQuyenRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhanQuyenServiceImp implements PhanQuyenService{

    PhanQuyenRepository phanQuyenRepository;

    public PhanQuyenServiceImp(PhanQuyenRepository phanQuyenRepository) {
        this.phanQuyenRepository = phanQuyenRepository;
    }

    @Override
    public List<PhanQuyen> getPhanQuyen() {
        List<PhanQuyen> phanQuyens = new ArrayList<>();
        phanQuyenRepository.findAll().forEach(phanQuyens::add);
        return phanQuyens;
    }

    @Override
    public PhanQuyen getPhanQuyenById(Integer id) {
        return phanQuyenRepository.findById(id).get();
    }

    @Override
    public PhanQuyen insert(PhanQuyen phanQuyen) {
        return phanQuyenRepository.save(phanQuyen);
    }
    @Override
    public PhanQuyen updatePhanQuyen(Integer id, PhanQuyen phanQuyen) {
        PhanQuyen phanQuyenFromDb = phanQuyenRepository.findById(id).get();
        System.out.println(phanQuyenFromDb.toString());
        phanQuyenFromDb.setHoVaTen(phanQuyen.getHoVaTen());
        phanQuyenFromDb.setPassword(phanQuyen.getPassword());
        phanQuyenFromDb.setUsername(phanQuyen.getUsername());
        phanQuyenRepository.save(phanQuyenFromDb);

        return phanQuyenFromDb;
    }

    @Override
    public void deletePhanQuyen(Integer id) {
        phanQuyenRepository.deleteById(id);
    }
}
