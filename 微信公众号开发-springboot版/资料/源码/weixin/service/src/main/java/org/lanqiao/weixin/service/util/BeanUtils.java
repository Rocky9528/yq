package org.lanqiao.weixin.service.util;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.lanqiao.weixin.service.service.MsgService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanUtils {
    @Bean
    public XmlMapper xmlMapper() {
        return new XmlMapper();
    }

    @Bean
    public MsgService msgService(){
        return new MsgService();
    }

}
