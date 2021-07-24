package com.aye.ayemoduleapi.client;

import com.aye.ayemoduleapi.dto.StatusDto;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aye-persistence-api", configuration = CustomFeignConfig.class)
public interface StatusClient {
    @RequestLine(value="GET /api/status/")
    List<StatusDto> findAllStatus();

    @RequestLine(value="POST /api/status")
    StatusDto createNewStatus(@RequestBody StatusDto statusDto);
}
