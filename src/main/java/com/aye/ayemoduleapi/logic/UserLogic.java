package com.aye.ayemoduleapi.logic;


import com.aye.ayemoduleapi.dto.NestDto;
import com.aye.ayemoduleapi.dto.UserDto;

import java.util.List;

public interface UserLogic {
    public List<UserDto> findAllUsers();
}
