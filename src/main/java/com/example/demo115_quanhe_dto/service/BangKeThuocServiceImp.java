package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;
import com.example.demo115_quanhe_dto.repository.BangKeThuocRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BangKeThuocServiceImp implements BangKeThuocService {
    BangKeThuocRepository bangKeThuocRepository;

    public BangKeThuocServiceImp(BangKeThuocRepository bangKeThuocRepository) {
        this.bangKeThuocRepository = bangKeThuocRepository;
    }

    @Override
    public List<BangKeThuoc> getBangKeThuoc() {
        List<BangKeThuoc> bangKeThuocs = new ArrayList<>();
        bangKeThuocRepository.findAll().forEach(bangKeThuocs::add);
        return bangKeThuocs;
    }

    @Override
    public BangKeThuoc getBangKeThuocById(Integer id) {
        return bangKeThuocRepository.findById(id).get();
    }

    @Override
    public BangKeThuoc insert(BangKeThuoc bangKeThuoc) {
        return bangKeThuocRepository.save(bangKeThuoc);
    }

    @Override
    public BangKeThuoc updateBangKeThuoc(Integer id, BangKeThuoc bangKeThuoc) {
        BangKeThuoc bangKeThuocFromDb = bangKeThuocRepository.findById(id).get();
        System.out.println(bangKeThuocFromDb.toString());
        bangKeThuocFromDb.setTenThuoc(bangKeThuoc.getTenThuoc());
        bangKeThuocFromDb.setDvt(bangKeThuoc.getDvt());
        bangKeThuocFromDb.setDonGia(bangKeThuoc.getDonGia());
        bangKeThuocFromDb.setSoLuong(bangKeThuoc.getSoLuong());
        bangKeThuocFromDb.setIdCapCuu(bangKeThuoc.getIdCapCuu());
        bangKeThuocFromDb.setThanhTien(bangKeThuoc.getThanhTien());
        bangKeThuocRepository.save(bangKeThuocFromDb);

        return bangKeThuocFromDb;
    }

    @Override
    public void deleteBangKeThuoc(Integer id) {
        bangKeThuocRepository.deleteById(id);
    }
}
