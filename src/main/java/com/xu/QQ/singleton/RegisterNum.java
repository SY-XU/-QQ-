package com.xu.QQ.singleton;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;

import com.xu.QQ.dao.mapper.TUserMapper;
import com.xu.QQ.domain.TUser;
import com.xu.QQ.domain.TUserExample;
import com.xu.QQ.service.loginService;

public class RegisterNum {
	
	TUserMapper mapper = (TUserMapper) ContextLoader.getCurrentWebApplicationContext().getBean("TUserMapper");
	
	String tnum=null; 
	
	private static volatile RegisterNum registerNum;
	
	private RegisterNum(){
		TUserExample example = new TUserExample();
		example.setOrderByClause("tnum desc");
		
		List<TUser> list = mapper.selectByExample(example);
		tnum = list.get(0).getTnum();
	}
	
	public static RegisterNum getRegisterNum(){
		if(registerNum == null){
			synchronized (RegisterNum.class) {
				if(registerNum == null){
					registerNum = new RegisterNum();
				}
			}
		}
		
		return registerNum;
	}
	
	public Integer getRegisternum(){
		
		
		Integer te = (Integer.parseInt(tnum)+1);
		tnum = te.toString();
		return (Integer.parseInt(tnum)+1);
	}
}
