package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.ToDieuTri;


import java.util.List;

public interface ToDieuTriService {
    List<ToDieuTri> getToDieuTri();

    ToDieuTri getToDieuTriById(Integer id);

    ToDieuTri insert(ToDieuTri toDieuTri);

    ToDieuTri updateToDieuTri(Integer id, ToDieuTri toDieuTri);

    void deleteToDieuTri(Integer idToDieuTri);

}
