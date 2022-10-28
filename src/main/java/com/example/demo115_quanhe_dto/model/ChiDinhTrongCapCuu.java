package com.example.demo115_quanhe_dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chi_dinh_trong_cap_cuu")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class ChiDinhTrongCapCuu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    private int idCapCuu;


    private String chiDinhTrongCapCuu;


    public ChiDinhTrongCapCuu() {
    }

    public ChiDinhTrongCapCuu(int id, int idCapCuu, String chiDinhTrongCapCuu) {
        this.id = id;
        this.idCapCuu = idCapCuu;
        this.chiDinhTrongCapCuu = chiDinhTrongCapCuu;
    }

    public int getIdCapCuu() {
        return idCapCuu;
    }

    public void setIdCapCuu(int idCapCuu) {
        this.idCapCuu = idCapCuu;
    }

    public String getChiDinhTrongCapCuu() {
        return chiDinhTrongCapCuu;
    }

    public void setChiDinhTrongCapCuu(String chiDinhTrongCapCuu) {
        this.chiDinhTrongCapCuu = chiDinhTrongCapCuu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }



}


