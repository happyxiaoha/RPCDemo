/*
 *	Title：aa.java<br>
 *  Date: 2018年3月21日 下午3:50:34<br>
 * 	Copyright (c) 2018 digitalchina <br>
 *
 * 	WebSite: http://www.digitalchina.com<br>
 * 
 */
package com.xiaoha.rpc.server;

import java.io.IOException;

/**
 *  <br>
 * 
 * @author haoyp
 * @version 1.0
 */
public interface Server {
  public void stop();

  public void start() throws IOException;

  public void register(Class serviceInterface, Class impl);

  public boolean isRunning();

  public int getPort();
}