package com.example.demo115_quanhe_dto.modeldto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
public class BenhAnVanChuyenCapCuuDto {
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
}
