package com.aye.ayemoduleapi.logic;


import com.aye.ayemoduleapi.dto.NestDto;
import com.aye.ayemoduleapi.dto.StatusDto;

import java.util.List;

public interface StatusLogic {
    public List<StatusDto> findAllStatus();
}
