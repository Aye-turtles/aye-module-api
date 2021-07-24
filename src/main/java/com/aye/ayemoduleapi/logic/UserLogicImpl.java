package com.aye.ayemoduleapi.logic;

import com.aye.ayemoduleapi.client.UserClient;
import com.aye.ayemoduleapi.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserLogicImpl implements UserLogic {

    @Autowired
    private UserClient userClient;

    @Override
    public List<UserDto> findAllUsers() {
        return userClient.findAllUsers();
    }
}
