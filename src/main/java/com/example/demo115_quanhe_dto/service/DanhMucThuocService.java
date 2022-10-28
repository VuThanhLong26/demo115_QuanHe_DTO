package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.DanhMucThuoc;


import java.util.List;

public interface DanhMucThuocService {
    List<DanhMucThuoc> getDanhMucThuoc();

    DanhMucThuoc getDanhMucThuocById(Integer id);

    DanhMucThuoc insert(DanhMucThuoc danhMucThuoc);

    DanhMucThuoc updateDanhMucThuoc(Integer id, DanhMucThuoc danhMucThuoc);

    void deleteDanhMucThuoc(Integer idDanhMuc);

}
