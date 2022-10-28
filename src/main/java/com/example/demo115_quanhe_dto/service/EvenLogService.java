package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.EvenLog;


import java.util.List;

public interface EvenLogService {
    List<EvenLog> getEvenLog();

    EvenLog getEvenLogById(Integer id);

    EvenLog insert(EvenLog evenLog);

    EvenLog updateEvenLog(Integer id, EvenLog evenLog);

    void deleteEvenLog(Integer idEvenLog);

}
