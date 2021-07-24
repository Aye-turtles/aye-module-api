package com.aye.ayemoduleapi.service;

import com.aye.ayemoduleapi.dto.NestLogsDto;
import com.aye.ayemoduleapi.logic.NestLogsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("nest-logs/")
public class NestLogsServiceImpl implements NestLogsService {
    @Autowired
    private NestLogsLogic nestLogsLogic;

    @Override
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<NestLogsDto> findAllNestsLogs() {
        return nestLogsLogic.findAllNestsLogs();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public List<NestLogsDto> findAllNestLogsById(@PathVariable("id") Integer id) {
        return nestLogsLogic.findAllNestLogsById(id);
    }
}
