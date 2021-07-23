package com.aye.ayemoduleapi.dto;

import lombok.Data;

import java.util.Date;

@Data
public class NestLogsDto {
    private Integer id;
    private Date log_Date;
    private Double temperature;
    private Double humidity;
    private NestDto id_nest;
}
