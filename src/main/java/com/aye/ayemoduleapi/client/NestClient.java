package com.aye.ayemoduleapi.client;

import com.aye.ayemoduleapi.dto.NestDto;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aye-persistence-api", configuration = CustomFeignConfig.class)
public interface NestClient {
    @RequestLine(value = "GET /api/nests/")
    List<NestDto> findAllNests();

    @RequestLine(value = "GET /api/nest/{id}")
    NestDto findNestById(@Param("id") Integer id);

    @RequestLine(value = "GET /api/nests/status/{status}")
    List<NestDto> findNestsByStatus(@Param("status")String status);

    @RequestLine(value = "GET /api/nests/collector/{username}")
    List<NestDto> findNestsByCollectorUserName(@Param("username") String collectorUsername);

    @RequestLine(value="POST  /api/nest/")
    NestDto createNewNest(@RequestBody NestDto nestDto);

    @RequestLine(value = "PUT /api/nest/")
    NestDto updateNest(@RequestBody NestDto nestDto);

}
