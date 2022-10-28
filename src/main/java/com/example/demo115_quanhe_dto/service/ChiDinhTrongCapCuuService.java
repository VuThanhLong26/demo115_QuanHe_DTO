package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.ChiDinhTrongCapCuu;


import java.util.List;

public interface ChiDinhTrongCapCuuService {
    List<ChiDinhTrongCapCuu> getChiDinhTrongCapCuu();

    ChiDinhTrongCapCuu getChiDinhTrongCapCuuById(Integer id);

    ChiDinhTrongCapCuu insert(ChiDinhTrongCapCuu chiDinhTrongCapCuu);

    ChiDinhTrongCapCuu updateChiDinhTrongCapCuu(Integer id, ChiDinhTrongCapCuu chiDinhTrongCapCuu);

    void deleteChiDinhTrongCapCuu(Integer idChiDinh);

}
