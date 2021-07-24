package com.aye.ayemoduleapi.client;

import com.aye.ayemoduleapi.dto.UserDto;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aye-persistence-api", configuration = CustomFeignConfig.class)
public interface UserClient {
    @RequestLine(value = "GET /api/users/")
    List<UserDto> findAllUsers();

    @RequestLine(value = "GET /api/user/{username}")
    UserDto findUserByUserName(@Param("username") String username);

    @RequestLine(value = "POST /api/user/")
    UserDto createNewUser(@RequestBody UserDto userDto);

    @RequestLine(value = "PUT /api/user/")
    UserDto updateUser(@RequestBody UserDto userDto);
}
