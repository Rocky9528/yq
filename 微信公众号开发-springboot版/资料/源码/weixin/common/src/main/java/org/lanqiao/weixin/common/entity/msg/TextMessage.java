package org.lanqiao.weixin.common.entity.msg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

//lobkok
@Data
@JacksonXmlRootElement(localName = "xml")
public class TextMessage {
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "ToUserName")
    private String toUser;
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "FromUserName")
    private String fromUser;
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "CreateTime")
    private String createTime;
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType="text";
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Content")
    private String content;
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MsgId")
    private String msgId;


}
