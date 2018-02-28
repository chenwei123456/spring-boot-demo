package com.hbu.service;

import com.hbu.bean.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by chenwei on 2018/2/3.
 */
@Service
public class WebSocketService {

    @Autowired
    //使用simpMessagingTemplate 向浏览器发送消息
    private SimpMessagingTemplate template;

    public void sendMessage() throws Exception{
        for(int i=0;i<10;i++){
            Thread.sleep(1000);
            template.convertAndSend("/topic/getResponse",new Response("Welcome,chenwei!"+i));
            System.out.println(".........................chenwei"+i);
        }
    }
}
