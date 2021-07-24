package com.aye.ayemoduleapi.service;


import com.aye.ayemoduleapi.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> findAllUsers();
}
