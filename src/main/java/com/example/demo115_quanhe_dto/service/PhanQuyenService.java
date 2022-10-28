package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.PhanQuyen;


import java.util.List;

public interface PhanQuyenService {
    List<PhanQuyen> getPhanQuyen();

    PhanQuyen getPhanQuyenById(Integer id);

    PhanQuyen insert(PhanQuyen phanQuyen);

    PhanQuyen updatePhanQuyen(Integer id, PhanQuyen phanQuyen);

    void deletePhanQuyen(Integer idPhanQuyen);

}
