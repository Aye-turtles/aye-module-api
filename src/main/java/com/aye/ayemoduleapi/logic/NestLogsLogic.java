package com.aye.ayemoduleapi.logic;


import com.aye.ayemoduleapi.dto.NestLogsDto;

import java.util.List;

public interface NestLogsLogic {
    public List<NestLogsDto> findAllNestsLogs();

    public List<NestLogsDto> findAllNestLogsById(Integer id);
}
