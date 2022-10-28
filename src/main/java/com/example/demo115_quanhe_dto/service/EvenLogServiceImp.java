package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.EvenLog;
import com.example.demo115_quanhe_dto.repository.EvenLogRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvenLogServiceImp implements EvenLogService{

    EvenLogRepository evenLogRepository;
    public EvenLogServiceImp(EvenLogRepository evenLogRepository) {
        this.evenLogRepository = evenLogRepository;
    }
    @Override
    public List<EvenLog> getEvenLog() {
        List<EvenLog> evenLogs = new ArrayList<>();
        evenLogRepository.findAll().forEach(evenLogs::add);
        return evenLogs;
    }

    @Override
    public EvenLog getEvenLogById(Integer id) {
        return evenLogRepository.findById(id).get();
    }

    @Override
    public EvenLog insert(EvenLog evenLog) {
        return evenLogRepository.save(evenLog);
    }

    @Override
    public EvenLog updateEvenLog(Integer id, EvenLog evenLog) {
        EvenLog evenLogFromDb = evenLogRepository.findById(id).get();
        System.out.println(evenLogFromDb.toString());
        evenLogFromDb.setEvent(evenLog.getEvent());
        evenLogFromDb.setUserId(evenLog.getUserId());
        evenLogRepository.save(evenLogFromDb);
        return evenLogFromDb;
    }
    @Override
    public void deleteEvenLog(Integer id) {
        evenLogRepository.deleteById(id);
    }
}
