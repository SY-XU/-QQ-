package com.xu.QQ.dao.mapper;

import java.util.List;
import java.util.Map;

import com.xu.QQ.domain.Ptphismes;
import com.xu.QQ.webpo.groupHistoryMessage;

public interface myselfMapper {
	//获取私聊消息
	List<Ptphismes> getPtpMessage(Map<String, Object> param);
	
	//获取群聊历史消息
	List<groupHistoryMessage> getGroupHistoryMessage(Integer groupid);
}
