package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.DanhMucThuoc;
import com.example.demo115_quanhe_dto.repository.DanhMucThuocRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DanhMucThuocServiceImp implements DanhMucThuocService{
    DanhMucThuocRepository danhMucThuocRepository;
     public DanhMucThuocServiceImp(DanhMucThuocRepository danhMucThuocRepository){
         this.danhMucThuocRepository = danhMucThuocRepository;
     }
    @Override
    public List<DanhMucThuoc> getDanhMucThuoc() {
        List<DanhMucThuoc> danhMucThuocs = new ArrayList<>();
        danhMucThuocRepository.findAll().forEach(danhMucThuocs::add);
        return danhMucThuocs;
    }

    @Override
    public DanhMucThuoc getDanhMucThuocById(Integer id) {
        return danhMucThuocRepository.findById(id).get();
    }

    @Override
    public DanhMucThuoc insert(DanhMucThuoc danhMucThuoc) {
        return danhMucThuocRepository.save(danhMucThuoc);
    }

    @Override
    public DanhMucThuoc updateDanhMucThuoc(Integer id, DanhMucThuoc danhMucThuoc) {
        DanhMucThuoc danhMucThuocFromDb = danhMucThuocRepository.findById(id).get();
        System.out.println(danhMucThuocFromDb.toString());
        danhMucThuocFromDb.setTenThuoc(danhMucThuoc.getTenThuoc());
        danhMucThuocFromDb.setIdThuoc(danhMucThuoc.getIdThuoc());
        danhMucThuocFromDb.setTrangThai(danhMucThuoc.getTrangThai());
        danhMucThuocFromDb.setIdBangKeThuoc(danhMucThuoc.getIdBangKeThuoc());
        danhMucThuocRepository.save(danhMucThuocFromDb);
        return danhMucThuocFromDb;
    }

    @Override
    public void deleteDanhMucThuoc(Integer id) {
        danhMucThuocRepository.deleteById(id);
    }
}
