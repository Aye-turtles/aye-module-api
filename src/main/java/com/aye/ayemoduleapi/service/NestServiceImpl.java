package com.aye.ayemoduleapi.service;

import com.aye.ayemoduleapi.dto.NestDto;
import com.aye.ayemoduleapi.logic.NestLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nest-service/")
public class NestServiceImpl implements NestService {

    @Autowired
    private NestLogic nestLogic;

    @Override
    @RequestMapping(value = "nests/", method = RequestMethod.GET, produces = "application/json")
    public List<NestDto> findAllNests() {
        return nestLogic.findAllNests();
    }
}
