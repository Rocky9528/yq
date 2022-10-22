package org.lanqiao.weixin.common.entity;

import lombok.Data;

@Data
public class AccessToken {

    private String access_token;
    private int expires_in;

}
