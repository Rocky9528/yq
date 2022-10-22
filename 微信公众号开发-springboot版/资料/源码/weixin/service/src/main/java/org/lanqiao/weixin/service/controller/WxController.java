package org.lanqiao.weixin.service.controller;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.lanqiao.weixin.common.entity.msg.TextMessage;
import org.lanqiao.weixin.common.entity.msg.TextMessageResp;
import org.lanqiao.weixin.service.config.Config;
import org.lanqiao.weixin.service.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Arrays;

@RestController
public class WxController {
    @Autowired
    Config config;
    @Autowired
    XmlMapper xmlMapper;
    @Autowired
    MsgService msgService;

    @PostMapping(value = "/wx",produces = "application/xml;charset=utf8")
    public Object getMsg(@RequestBody String data){
        Object objMsg = msgService.getResp(data);
        return objMsg;
    }

    @GetMapping("/wx")
    public String check(String signature,String timestamp,String nonce,String echostr){
        /**
         * signature	微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
         * timestamp	时间戳
         * nonce	随机数
         * echostr	随机字符串
         */
        String token = config.getToken();
        String[] strs = {token,timestamp,nonce};
        //排序
        Arrays.sort(strs);
        //组成一个字符串
        String s = strs[0]+strs[1]+strs[2];
        //加密
        String s1 = DigestUtils.sha1Hex(s);
        if(s1.equalsIgnoreCase(signature)){
            System.out.println("接入成功");
            return echostr;
        }else{
            return "接入失败";
        }

    }

}
