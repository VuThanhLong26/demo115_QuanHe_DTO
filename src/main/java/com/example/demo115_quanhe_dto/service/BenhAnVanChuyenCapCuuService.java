package com.example.demo115_quanhe_dto.service;


import com.example.demo115_quanhe_dto.model.BenhAnVanChuyenCapCuu;


import java.util.List;

public interface BenhAnVanChuyenCapCuuService {

    List<BenhAnVanChuyenCapCuu> getBenhAnVanChuyenCapCuu();

    BenhAnVanChuyenCapCuu getBenhAnVanChuyenCapCuuById(Integer id);

    BenhAnVanChuyenCapCuu insert(BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu);

    BenhAnVanChuyenCapCuu updateBenhAn(Integer id, BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu);

    void deleteBenhAn(Integer idBenhAn);
}
