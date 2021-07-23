package com.aye.ayemoduleapi.dto;

import lombok.Data;

import java.util.Date;

@Data
public class NestDto {
    private Integer id;
    private Integer amount_Eggs;
    private Date recollection_Date;
    private Date hatching_Date;
    private UserDto collector;
    private StatusDto status;

    public NestDto(Integer id, Integer amount_Eggs, Date recollection_Date, Date hatching_Date, UserDto collector, StatusDto status) {
        this.id = id;
        this.amount_Eggs = amount_Eggs;
        this.recollection_Date = recollection_Date;
        this.hatching_Date = hatching_Date;
        this.collector = collector;
        this.status = status;
    }

}
