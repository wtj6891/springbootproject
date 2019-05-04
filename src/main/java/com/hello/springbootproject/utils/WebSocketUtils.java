package com.hello.springbootproject.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.websocket.Session;
import javax.websocket.RemoteEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/******
 *Name: WebSocketUtils
 *User: Administrator
 *Date: 2019/5/3
 **/
public final class WebSocketUtils {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketUtils.class);

    public static final Map<String, Session> ONLINE_USER_SESSIONS = new ConcurrentHashMap<>();

    public static void sendMessage(Session session, String message) {
        if(session == null) {
            return;
        }
        final RemoteEndpoint.Basic basic = session.getBasicRemote();
        if(basic == null) {
            return;
        }
        try {
            basic.sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendMessageAll(String message) {
        ONLINE_USER_SESSIONS.forEach((sessionId, session) -> sendMessage(session, message));
    }
}
