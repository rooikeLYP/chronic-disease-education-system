package com.lyp.demo.controller;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

public class MySessionContext {
  private static HashMap<String, HttpSession> sessionMap = new HashMap<>();

  public static void setSessionMap( HttpSession session) {
    sessionMap.put(session.getId(), session);
  }

  public static HttpSession getSession(String sessionID) {
    return sessionMap.get(sessionID);
  }
}
