package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.BangKeThuoc;


import java.util.List;

public interface BangKeThuocService {
    List<BangKeThuoc> getBangKeThuoc();

    BangKeThuoc getBangKeThuocById(Integer id);

    BangKeThuoc insert(BangKeThuoc bangKeThuoc);

    BangKeThuoc updateBangKeThuoc(Integer id, BangKeThuoc bangKeThuoc);

    void deleteBangKeThuoc(Integer id);
}
