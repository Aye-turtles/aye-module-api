package com.aye.ayemoduleapi.logic;

import com.aye.ayemoduleapi.client.NestLogsClient;
import com.aye.ayemoduleapi.dto.NestLogsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NestLogsLogicImpl implements NestLogsLogic {
    @Autowired
    private NestLogsClient nestLogsClient;

    @Override
    public List<NestLogsDto> findAllNestsLogs() {
        return nestLogsClient.findAllNestsLogs();
    }

    @Override
    public List<NestLogsDto> findAllNestLogsById(Integer id) {
        return nestLogsClient.findNestLogsByNestId(id);
    }
}
