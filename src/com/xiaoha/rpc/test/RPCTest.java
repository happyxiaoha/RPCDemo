/*
 *	Title：sds.java<br>
 *  Date: 2018年3月21日 下午3:54:34<br>
 * 	Copyright (c) 2018 digitalchina <br>
 *
 * 	WebSite: http://www.digitalchina.com<br>
 * 
 */
package com.xiaoha.rpc.test;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.xiaoha.rpc.HelloService;
import com.xiaoha.rpc.HelloServiceImpl;
import com.xiaoha.rpc.client.RPCClient;
import com.xiaoha.rpc.server.Server;
import com.xiaoha.rpc.server.ServiceCenter;

/**
 *  <br>
 * 
 * @author haoyp
 * @version 1.0
 */
public class RPCTest {
  
  public static void main(String[] args) throws IOException {
      new Thread(new Runnable() {
          public void run() {
              try {
                  Server serviceServer = new ServiceCenter(8088);
                  serviceServer.register(HelloService.class, HelloServiceImpl.class);
                  serviceServer.start();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }).start();
      HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
      System.out.println(service.sayHi("test"));
  }
}