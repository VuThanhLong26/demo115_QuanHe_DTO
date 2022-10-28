package com.example.demo115_quanhe_dto.repository;

import com.example.demo115_quanhe_dto.model.ChiDinhTrongCapCuu;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiDinhTrongCapCuuRepository extends CrudRepository<ChiDinhTrongCapCuu, Integer> {
}
