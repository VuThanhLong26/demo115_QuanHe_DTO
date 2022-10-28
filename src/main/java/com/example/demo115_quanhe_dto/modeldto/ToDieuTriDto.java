package com.example.demo115_quanhe_dto.modeldto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ToDieuTriDto {
    private int idDieuTri;
    private LocalDateTime ngayGio;
    private String dienBienBenh;
    private String yLenh;
    private int idCapCuu;
}
