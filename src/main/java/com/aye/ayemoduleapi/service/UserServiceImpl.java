package com.aye.ayemoduleapi.service;

import com.aye.ayemoduleapi.dto.UserDto;
import com.aye.ayemoduleapi.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user/")
public class UserServiceImpl implements UserService {

   @Autowired
   private UserLogic userLogic;

    @Override
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<UserDto> findAllUsers() {
        return userLogic.findAllUsers();
    }
}
