package com.aye.ayemoduleapi.client;

import com.aye.ayemoduleapi.dto.NestDto;
import com.aye.ayemoduleapi.dto.NestLogsDto;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aye-persistence-api", configuration = CustomFeignConfig.class)
public interface NestLogsClient {
    @RequestLine(value="GET /api/nests-logs/")
    List<NestLogsDto> findAllNestsLogs();

    @RequestLine(value="GET /api/nests-logs/{id}")
    List<NestLogsDto> findNestLogsByNestId(@Param("id") Integer id);

    @RequestLine(value="POST /api/nest-log/")
    NestLogsDto createNewNestLogsEntity(@RequestBody NestLogsDto nestLogsDto);
}
