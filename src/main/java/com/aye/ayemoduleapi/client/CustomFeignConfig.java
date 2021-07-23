package com.aye.ayemoduleapi.client;

import feign.Contract;
import org.springframework.context.annotation.Bean;

public class CustomFeignConfig {
    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

}
