package org.lanqiao.weixin.function.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "wx")
@Component
@Data
public class Config {

    String appid;
    String appsecret;
    String tokenurl;
    String codeurl;

}
