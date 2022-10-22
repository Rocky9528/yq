package org.lanqiao.weixin.common;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.weixin.common.entity.msg.TextMessage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApplicationTests {

    @Test
    public void contextLoads() {
        TextMessage tm = new TextMessage();
        tm.setToUser("to");
        tm.setFromUser("from");
        tm.setContent("content");
        tm.setCreateTime("432432");
        tm.setMsgType("text");
        tm.setMsgId("4324");
        XmlMapper  xm = new XmlMapper();

    }

}
