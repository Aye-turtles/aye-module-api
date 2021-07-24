package com.aye.ayemoduleapi.service;

import com.aye.ayemoduleapi.dto.StatusDto;
import com.aye.ayemoduleapi.logic.StatusLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("status/")
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusLogic statusLogic;

    @Override
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<StatusDto> findAllStatus() {
        return statusLogic.findAllStatus();
    }
}
