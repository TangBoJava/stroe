package com.baidu.action;

import com.opensymphony.xwork2.ActionSupport;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月8日 下午8:08:58 <br/>       
 */
public class UserAction extends ActionSupport{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String findUser(){
        return SUCCESS;
    }
}
  
