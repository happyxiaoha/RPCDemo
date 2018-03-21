/*
 *	Title：sas.java<br>
 *  Date: 2018年3月21日 下午3:50:05<br>
 * 	Copyright (c) 2018 digitalchina <br>
 *
 * 	WebSite: http://www.digitalchina.com<br>
 * 
 */
package com.xiaoha.rpc;
/**
 *  <br>
 * 
 * @author haoyp
 * @version 1.0
 */
public class HelloServiceImpl implements HelloService {
  
  public String sayHi(String name) {
      return "Hi, " + name;
  }

}