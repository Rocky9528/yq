package org.lanqiao.weixin.common.entity.qrcode;

import lombok.Data;

@Data
public class Code {
    //{"ticket":"gQH47joAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL2taZ2Z3TVRtNzJXV1Brb3ZhYmJJAAIEZ23sUwMEmm
    //3sUw==","expire_seconds":60,"url":"http://weixin.qq.com/q/kZgfwMTm72WWPkovabbI"}
    private String ticket;
    private int expire_seconds;
    private String url;
}
