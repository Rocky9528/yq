package org.lanqiao.weixin.service.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.lanqiao.weixin.common.entity.msg.TextMessageResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MsgService {

    XmlMapper xmlMapper;

    public Object getResp(String data){
        //用户发过来的是什么消息
        Document document = null;
        try {
            document = DocumentHelper.parseText(data);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        Map<String,String> map = new HashMap<>();
        for(Element e:elements){
            map.put(e.getName(), e.getStringValue());
        }
        String msgType = map.get("MsgType");
        switch (msgType){
            case "text":
                return dealText(map);
            case "image":
                return dealImage(map);
            case "voice":

                break;
            case "video":

                break;
            case "shortvideo":

                break;
            case "location":

                break;
            case "link":

                break;
            case "event":

                break;
        }

        return null;
    }

    /**
     * 处理图片消息
     */
    private Object dealImage(Map<String, String> map) {
        TextMessageResp tm = new TextMessageResp();
        tm.setContent("您发的的图片消息");
        tm.setToUser(map.get("FromUserName"));
        tm.setFromUser(map.get("ToUserName"));
        tm.setCreateTime(System.currentTimeMillis()/1000+"");
        return tm;
    }

    /**
     * 处理文件消息
     */
    private Object dealText(Map<String, String> map) {
        TextMessageResp tm = new TextMessageResp();
        tm.setContent("您发的的文本消息");
        tm.setToUser(map.get("FromUserName"));
        tm.setFromUser(map.get("ToUserName"));
        tm.setCreateTime(System.currentTimeMillis()/1000+"");
        return tm;
    }

}
