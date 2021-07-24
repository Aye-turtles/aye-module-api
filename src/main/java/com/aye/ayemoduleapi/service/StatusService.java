package com.aye.ayemoduleapi.service;


import com.aye.ayemoduleapi.dto.StatusDto;

import java.util.List;

public interface StatusService {
    public List<StatusDto> findAllStatus();
}
