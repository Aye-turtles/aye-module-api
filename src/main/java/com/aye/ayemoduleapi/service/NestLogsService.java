package com.aye.ayemoduleapi.service;


import com.aye.ayemoduleapi.dto.NestLogsDto;

import java.util.List;

public interface NestLogsService {
    public List<NestLogsDto> findAllNestsLogs();

    public List<NestLogsDto> findAllNestLogsById(Integer id);
}
