package org.lanqiao.weixin.function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.weixin.common.entity.AccessToken;
import org.lanqiao.weixin.common.entity.qrcode.*;
import org.lanqiao.weixin.function.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import sun.jvm.hotspot.runtime.ObjectMonitor;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FunctionApplicationTests {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    Config config;

    @Test
    public void testGetTempCode(){
        AccessToken at = restTemplate.getForObject(config.getTokenurl(), AccessToken.class, (Object) null);
        System.out.println(at);
        //准备数据
        Scene scene = new Scene();
        scene.setScene_str("lanqiao");
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setScene(scene);
        TempCode tempCode = new TempCode();
        tempCode.setAction_info(actionInfo);
        tempCode.setExpire_seconds(3600);
        tempCode.setAction_name("QR_STR_SCENE");
        //
        HttpHeaders headers = new HttpHeaders();
        //指定为json格式
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(tempCode, headers);
        Code code = restTemplate.postForObject(config.getCodeurl().replace("TOKEN", at.getAccess_token()), entity, Code.class);
        System.out.println(code);
    }

    @Test
    public void getToken() {
        AccessToken at = restTemplate.getForObject(config.getTokenurl(), AccessToken.class, (Object) null);
        System.out.println(at);
    }

}
