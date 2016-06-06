package com.antteam.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public  class User {
    private Integer id;

    private String userName;

    private String accountName;

    private String password;

    private String credentialsSalt;

    private String description;

    private boolean locked;

    private Date createTime;

    private Integer deletestatus;

    public String getLockedLabel(){
    	if(locked){
    		return "锁定";
    	}
    	return "解锁";
    }
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getCreateTime() {
        return createTime;
    }

}