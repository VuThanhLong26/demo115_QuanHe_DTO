package com.example.demo115_quanhe_dto.service;

import com.example.demo115_quanhe_dto.model.BenhAnVanChuyenCapCuu;
import com.example.demo115_quanhe_dto.repository.BenhAnVanChuyenCapCuuRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BenhAnVanChuyenCapCuuImp implements BenhAnVanChuyenCapCuuService{

    BenhAnVanChuyenCapCuuRepository benhAnVanChuyenCapCuuRepository;

    public BenhAnVanChuyenCapCuuImp(BenhAnVanChuyenCapCuuRepository benhAnVanChuyenCapCuuRepository){
        this.benhAnVanChuyenCapCuuRepository = benhAnVanChuyenCapCuuRepository;
    }
    @Override
    public List<BenhAnVanChuyenCapCuu> getBenhAnVanChuyenCapCuu() {
        List<BenhAnVanChuyenCapCuu> benhAnVanChuyenCapCuus = new ArrayList<>();
        benhAnVanChuyenCapCuuRepository.findAll().forEach(benhAnVanChuyenCapCuus::add);
        return benhAnVanChuyenCapCuus;
    }
    @Override
    public BenhAnVanChuyenCapCuu getBenhAnVanChuyenCapCuuById(Integer id) {
        return benhAnVanChuyenCapCuuRepository.findById(id).get();
    }
    @Override
    public BenhAnVanChuyenCapCuu insert(BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu) {
        return benhAnVanChuyenCapCuuRepository.save(benhAnVanChuyenCapCuu);
    }

    @Override
    public BenhAnVanChuyenCapCuu updateBenhAn(Integer id, BenhAnVanChuyenCapCuu benhAnVanChuyenCapCuu) {
        BenhAnVanChuyenCapCuu benhAnFromDb = benhAnVanChuyenCapCuuRepository.findById(id).get();
        System.out.println(benhAnFromDb.toString());
        benhAnFromDb.setBenhChinh(benhAnVanChuyenCapCuu.getBenhChinh());
        benhAnFromDb.setBenhKem(benhAnVanChuyenCapCuu.getBenhKem());
        benhAnFromDb.setChuyenDenBenhVien(benhAnVanChuyenCapCuu.getChuyenDenBenhVien());
        benhAnFromDb.setBienChung(benhAnVanChuyenCapCuu.getBienChung());
        benhAnFromDb.setDiaChi(benhAnVanChuyenCapCuu.getDiaChi());
        benhAnFromDb.setGioDen(benhAnVanChuyenCapCuu.getGioDen());
        benhAnFromDb.setGioDenHienTruong(benhAnVanChuyenCapCuu.getGioDenHienTruong());
        benhAnFromDb.setGioiTinh(benhAnVanChuyenCapCuu.getGioiTinh());
        benhAnFromDb.setHoVaTen(benhAnVanChuyenCapCuu.getHoVaTen());
        benhAnFromDb.setGioNhanDienThoaiGoiDen(benhAnVanChuyenCapCuu.getGioNhanDienThoaiGoiDen());
        benhAnFromDb.setHuyetAp(benhAnVanChuyenCapCuu.getHuyetAp());
        benhAnFromDb.setKhoangCach(benhAnVanChuyenCapCuu.getKhoangCach());
        benhAnFromDb.setNgheNghiep(benhAnVanChuyenCapCuu.getNgheNghiep());
        benhAnFromDb.setKyThuatThucHien(benhAnVanChuyenCapCuu.getKyThuatThucHien());
        benhAnFromDb.setNhietDo(benhAnVanChuyenCapCuu.getNhietDo());
        benhAnFromDb.setLyDoGoiCapCuu(benhAnVanChuyenCapCuu.getLyDoGoiCapCuu());
        benhAnFromDb.setBienChung(benhAnVanChuyenCapCuu.getBienChung());
        benhAnFromDb.setMach(benhAnVanChuyenCapCuu.getMach());
        benhAnFromDb.setSpo2(benhAnVanChuyenCapCuu.getSpo2());
        benhAnFromDb.setTanSoTho(benhAnVanChuyenCapCuu.getTanSoTho());
        benhAnFromDb.setGioNhanDienThoaiGoiDen(benhAnVanChuyenCapCuu.getGioNhanDienThoaiGoiDen());
        benhAnFromDb.setSdtGoiCapCuu(benhAnVanChuyenCapCuu.getSdtGoiCapCuu());
        benhAnFromDb.setSdtNguoiBenh(benhAnVanChuyenCapCuu.getSdtNguoiBenh());
        benhAnFromDb.setTrieuChung(benhAnVanChuyenCapCuu.getTrieuChung());
        benhAnFromDb.setTriGiac(benhAnVanChuyenCapCuu.getTriGiac());
        benhAnFromDb.setXuTriBanDau(benhAnVanChuyenCapCuu.getXuTriBanDau());
        benhAnFromDb.setKyThuatThucHien(benhAnVanChuyenCapCuu.getKyThuatThucHien());
        benhAnFromDb.setThuocCapCuu(benhAnVanChuyenCapCuu.getThuocCapCuu());
        benhAnFromDb.setChuyenDenBenhVien(benhAnVanChuyenCapCuu.getChuyenDenBenhVien());
        benhAnFromDb.setGioDen(benhAnVanChuyenCapCuu.getGioDen());
        benhAnFromDb.setSdtGoiCapCuu(benhAnVanChuyenCapCuu.getSdtGoiCapCuu());
        benhAnFromDb.setThoiGianXuLyCapCuu(benhAnFromDb.getThoiGianXuLyCapCuu());
        benhAnFromDb.setLyDoGoiCapCuu(benhAnVanChuyenCapCuu.getLyDoGoiCapCuu());
        benhAnFromDb.setTienSu(benhAnVanChuyenCapCuu.getTienSu());
        benhAnFromDb.setTinhTrangHienTai(benhAnVanChuyenCapCuu.getTinhTrangHienTai());
        benhAnFromDb.setGioNhanDienThoaiGoiDen(benhAnVanChuyenCapCuu.getGioNhanDienThoaiGoiDen());


        return benhAnFromDb;
    }

    @Override
    public void deleteBenhAn(Integer id) {
        benhAnVanChuyenCapCuuRepository.deleteById(id);
    }
}
