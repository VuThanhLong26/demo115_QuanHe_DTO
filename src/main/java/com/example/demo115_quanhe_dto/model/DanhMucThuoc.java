package com.example.demo115_quanhe_dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "danh_muc_thuoc")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class DanhMucThuoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sttThuoc;


    private int idBangKeThuoc;
    private String tenThuoc;
    private int idThuoc;
    private Boolean trangThai;

    public DanhMucThuoc() {
    }

    public DanhMucThuoc(int sttThuoc, int idBangKeThuoc, String tenThuoc, int idThuoc, Boolean trangThai) {
        this.sttThuoc = sttThuoc;
        this.idBangKeThuoc = idBangKeThuoc;
        this.tenThuoc = tenThuoc;
        this.idThuoc = idThuoc;
        this.trangThai = trangThai;
    }

    public int getIdBangKeThuoc() {
        return idBangKeThuoc;
    }

    public void setIdBangKeThuoc(int idBangKeThuoc) {
        this.idBangKeThuoc = idBangKeThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSttThuoc() {
        return sttThuoc;
    }

    public void setSttThuoc(int sttThuoc) {
        this.sttThuoc = sttThuoc;
    }

    public int getIdThuoc() {
        return idThuoc;
    }

    public void setIdThuoc(int idThuoc) {
        this.idThuoc = idThuoc;
    }
}