package com.aye.ayemoduleapi.client;

import com.aye.ayemoduleapi.dto.NestDto;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value = "aye-persistence-api", configuration = CustomFeignConfig.class)
public interface NestClient {
    @RequestLine(value="GET /api/nests/")
    List<NestDto> findAllNests();
}
