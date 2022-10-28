package com.example.demo115_quanhe_dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "benh_an_van_chuyen_cap_cuu")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class BenhAnVanChuyenCapCuu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cap_cuu")
    private int idCapCuu;
    private String hoVaTen;
    private int tuoi;
    private String gioiTinh;
    private String ngheNghiep;
    private String diaChi;
    private String noiGoiCapCuu;
    private String sdtNguoiBenh;
    private LocalTime gioNhanDienThoaiGoiDen;
    private LocalTime gioDenHienTruong;
    private String thoiGianXuLyCapCuu;
    private Double khoangCach;
    private String sdtGoiCapCuu;
    private String tienSu;
    private String tinhTrangHienTai;
    private int mach;
    private double nhietDo;
    private String huyetAp;
    private String triGiac;
    private int spo2;
    private int tanSoTho;
    private String trieuChung;
    private String benhChinh;
    private String benhKem;
    private String bienChung;
    private String xuTriBanDau;
    private String kyThuatThucHien;
    private String thuocCapCuu;
    private String chuyenDenBenhVien;
    private LocalTime gioDen;
    private LocalDate ngayThucHien;

    private String tinhTrangSauCapCuu;

    private String xuLySauCapCuu;
    private String lyDoGoiCapCuu;



    public BenhAnVanChuyenCapCuu() {
    }

    public BenhAnVanChuyenCapCuu(int idCapCuu, String hoVaTen, int tuoi, String gioiTinh, String ngheNghiep, String diaChi, String noiGoiCapCuu, String sdtNguoiBenh, LocalTime gioNhanDienThoaiGoiDen, LocalTime gioDenHienTruong, String thoiGianXuLyCapCuu, Double khoangCach, String sdtGoiCapCuu, String tienSu, String tinhTrangHienTai, int mach, double nhietDo, String huyetAp, String triGiac, int spo2, int tanSoTho, String trieuChung, String benhChinh, String benhKem, String bienChung, String xuTriBanDau, String kyThuatThucHien, String thuocCapCuu, String chuyenDenBenhVien, LocalTime gioDen, LocalDate ngayThucHien, String tinhTrangSauCapCuu, String xuLySauCapCuu, String lyDoGoiCapCuu) {
        this.idCapCuu = idCapCuu;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.ngheNghiep = ngheNghiep;
        this.diaChi = diaChi;
        this.noiGoiCapCuu = noiGoiCapCuu;
        this.sdtNguoiBenh = sdtNguoiBenh;
        this.gioNhanDienThoaiGoiDen = gioNhanDienThoaiGoiDen;
        this.gioDenHienTruong = gioDenHienTruong;
        this.thoiGianXuLyCapCuu = thoiGianXuLyCapCuu;
        this.khoangCach = khoangCach;
        this.sdtGoiCapCuu = sdtGoiCapCuu;
        this.tienSu = tienSu;
        this.tinhTrangHienTai = tinhTrangHienTai;
        this.mach = mach;
        this.nhietDo = nhietDo;
        this.huyetAp = huyetAp;
        this.triGiac = triGiac;
        this.spo2 = spo2;
        this.tanSoTho = tanSoTho;
        this.trieuChung = trieuChung;
        this.benhChinh = benhChinh;
        this.benhKem = benhKem;
        this.bienChung = bienChung;
        this.xuTriBanDau = xuTriBanDau;
        this.kyThuatThucHien = kyThuatThucHien;
        this.thuocCapCuu = thuocCapCuu;
        this.chuyenDenBenhVien = chuyenDenBenhVien;
        this.gioDen = gioDen;
        this.ngayThucHien = ngayThucHien;
        this.tinhTrangSauCapCuu = tinhTrangSauCapCuu;
        this.xuLySauCapCuu = xuLySauCapCuu;
        this.lyDoGoiCapCuu = lyDoGoiCapCuu;
    }

    public int getIdCapCuu() {
        return idCapCuu;
    }

    public void setIdCapCuu(int idCapCuu) {
        this.idCapCuu = idCapCuu;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNoiGoiCapCuu() {
        return noiGoiCapCuu;
    }

    public void setNoiGoiCapCuu(String noiGoiCapCuu) {
        this.noiGoiCapCuu = noiGoiCapCuu;
    }

    public String getSdtNguoiBenh() {
        return sdtNguoiBenh;
    }

    public void setSdtNguoiBenh(String sdtNguoiBenh) {
        this.sdtNguoiBenh = sdtNguoiBenh;
    }



    public String getThoiGianXuLyCapCuu() {
        return thoiGianXuLyCapCuu;
    }

    public void setThoiGianXuLyCapCuu(String thoiGianXuLyCapCuu) {
        this.thoiGianXuLyCapCuu = thoiGianXuLyCapCuu;
    }

    public Double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(Double khoangCach) {
        this.khoangCach = khoangCach;
    }

    public String getSdtGoiCapCuu() {
        return sdtGoiCapCuu;
    }

    public void setSdtGoiCapCuu(String sdtGoiCapCuu) {
        this.sdtGoiCapCuu = sdtGoiCapCuu;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getTinhTrangHienTai() {
        return tinhTrangHienTai;
    }

    public void setTinhTrangHienTai(String tinhTrangHienTai) {
        this.tinhTrangHienTai = tinhTrangHienTai;
    }

    public int getMach() {
        return mach;
    }

    public void setMach(int mach) {
        this.mach = mach;
    }

    public double getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(double nhietDo) {
        this.nhietDo = nhietDo;
    }

    public String getHuyetAp() {
        return huyetAp;
    }

    public void setHuyetAp(String huyetAp) {
        this.huyetAp = huyetAp;
    }

    public String getTriGiac() {
        return triGiac;
    }

    public void setTriGiac(String triGiac) {
        this.triGiac = triGiac;
    }

    public int getSpo2() {
        return spo2;
    }

    public void setSpo2(int spo2) {
        this.spo2 = spo2;
    }

    public int getTanSoTho() {
        return tanSoTho;
    }

    public void setTanSoTho(int tanSoTho) {
        this.tanSoTho = tanSoTho;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getBenhChinh() {
        return benhChinh;
    }

    public void setBenhChinh(String benhChinh) {
        this.benhChinh = benhChinh;
    }

    public String getBenhKem() {
        return benhKem;
    }

    public void setBenhKem(String benhKem) {
        this.benhKem = benhKem;
    }

    public String getBienChung() {
        return bienChung;
    }

    public void setBienChung(String bienChung) {
        this.bienChung = bienChung;
    }

    public String getXuTriBanDau() {
        return xuTriBanDau;
    }

    public void setXuTriBanDau(String xuTriBanDau) {
        this.xuTriBanDau = xuTriBanDau;
    }

    public String getKyThuatThucHien() {
        return kyThuatThucHien;
    }

    public void setKyThuatThucHien(String kyThuatThucHien) {
        this.kyThuatThucHien = kyThuatThucHien;
    }

    public String getThuocCapCuu() {
        return thuocCapCuu;
    }

    public void setThuocCapCuu(String thuocCapCuu) {
        this.thuocCapCuu = thuocCapCuu;
    }

    public String getChuyenDenBenhVien() {
        return chuyenDenBenhVien;
    }

    public void setChuyenDenBenhVien(String chuyenDenBenhVien) {
        this.chuyenDenBenhVien = chuyenDenBenhVien;
    }

    public LocalTime getGioDen() {
        return gioDen;
    }

    public void setGioDen(LocalTime gioDen) {
        this.gioDen = gioDen;
    }

    public LocalTime getGioNhanDienThoaiGoiDen() {
        return gioNhanDienThoaiGoiDen;
    }

    public void setGioNhanDienThoaiGoiDen(LocalTime gioNhanDienThoaiGoiDen) {
        this.gioNhanDienThoaiGoiDen = gioNhanDienThoaiGoiDen;
    }

    public LocalTime getGioDenHienTruong() {
        return gioDenHienTruong;
    }

    public void setGioDenHienTruong(LocalTime gioDenHienTruong) {
        this.gioDenHienTruong = gioDenHienTruong;
    }

    public LocalDate getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(LocalDate ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public String getTinhTrangSauCapCuu() {
        return tinhTrangSauCapCuu;
    }

    public void setTinhTrangSauCapCuu(String tinhTrangSauCapCuu) {
        this.tinhTrangSauCapCuu = tinhTrangSauCapCuu;
    }

    public String getXuLySauCapCuu() {
        return xuLySauCapCuu;
    }

    public void setXuLySauCapCuu(String xuLySauCapCuu) {
        this.xuLySauCapCuu = xuLySauCapCuu;
    }

    public String getLyDoGoiCapCuu() {
        return lyDoGoiCapCuu;
    }

    public void setLyDoGoiCapCuu(String lyDoGoiCapCuu) {
        this.lyDoGoiCapCuu = lyDoGoiCapCuu;
    }


}
