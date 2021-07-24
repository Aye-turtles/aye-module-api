package com.aye.ayemoduleapi.logic;

import com.aye.ayemoduleapi.client.NestClient;
import com.aye.ayemoduleapi.dto.NestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class NestLogicImpl implements NestLogic {

    @Autowired
    private NestClient nestClient;

    @Override
    public List<NestDto> findAllNests() {
        return nestClient.findAllNests();
    }

}
