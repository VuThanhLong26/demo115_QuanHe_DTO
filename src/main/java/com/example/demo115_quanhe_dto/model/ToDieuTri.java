package com.example.demo115_quanhe_dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "to_dieu_tri")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class ToDieuTri implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDieuTri;
    private LocalDateTime ngayGio;
    private String dienBienBenh;
    private String yLenh;

    private int idCapCuu;

    public ToDieuTri() {
    }

    public ToDieuTri(int idDieuTri, LocalDateTime ngayGio, String dienBienBenh, String yLenh, int idCapCuu) {
        this.idDieuTri = idDieuTri;
        this.ngayGio = ngayGio;
        this.dienBienBenh = dienBienBenh;
        this.yLenh = yLenh;
        this.idCapCuu = idCapCuu;
    }

    public int getIdDieuTri() {
        return idDieuTri;
    }

    public void setIdDieuTri(int idDieuTri) {
        this.idDieuTri = idDieuTri;
    }

    public LocalDateTime getNgayGio() {
        return ngayGio;
    }

    public void setNgayGio(LocalDateTime ngayGio) {
        this.ngayGio = ngayGio;
    }

    public String getDienBienBenh() {
        return dienBienBenh;
    }

    public void setDienBienBenh(String dienBienBenh) {
        this.dienBienBenh = dienBienBenh;
    }

    public String getyLenh() {
        return yLenh;
    }

    public void setyLenh(String yLenh) {
        this.yLenh = yLenh;
    }

    public int getIdCapCuu() {
        return idCapCuu;
    }

    public void setIdCapCuu(int idCapCuu) {
        this.idCapCuu = idCapCuu;
    }
}
