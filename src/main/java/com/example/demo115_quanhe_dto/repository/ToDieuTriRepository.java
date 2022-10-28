package com.example.demo115_quanhe_dto.repository;

import com.example.demo115_quanhe_dto.model.ToDieuTri;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDieuTriRepository extends CrudRepository<ToDieuTri, Integer> {
}
