package com.aye.ayemoduleapi.logic;

import com.aye.ayemoduleapi.client.StatusClient;
import com.aye.ayemoduleapi.dto.StatusDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StatusLogicImpl implements StatusLogic {

    @Autowired
    private StatusClient statusClient;

    @Override
    public List<StatusDto> findAllStatus() {
        return statusClient.findAllStatus();
    }
}
