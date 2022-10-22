package org.lanqiao.weixin.function.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
public class BeanUtils {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
