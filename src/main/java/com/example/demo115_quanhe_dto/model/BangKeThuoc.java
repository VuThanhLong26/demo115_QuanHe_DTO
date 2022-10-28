package com.example.demo115_quanhe_dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bang_ke_thuoc")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class BangKeThuoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stt;

    private String tenThuoc;
    private String dvt;
    private int soLuong;
    private int donGia;
    private int thanhTien;

    private int idCapCuu;
    private int idThuoc;

    public BangKeThuoc() {
    }

    public BangKeThuoc(int stt, String tenThuoc, String dvt, int soLuong, int donGia, int thanhTien, int idCapCuu, int idThuoc) {
        this.stt = stt;
        this.tenThuoc = tenThuoc;
        this.dvt = dvt;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.idCapCuu = idCapCuu;
        this.idThuoc = idThuoc;
    }

    public void setIdCapCuu(int idCapCuu) {
        this.idCapCuu = idCapCuu;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }


    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getIdCapCuu() {
        return idCapCuu;
    }

    public int getIdThuoc() {
        return idThuoc;
    }

    public void setIdThuoc(int idThuoc) {
        this.idThuoc = idThuoc;
    }
}