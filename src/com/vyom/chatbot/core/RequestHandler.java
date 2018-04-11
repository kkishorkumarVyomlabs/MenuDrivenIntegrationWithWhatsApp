package com.vyom.chatbot.core;

import java.io.Serializable;

public class RequestHandler implements Serializable{
	
	public String getRequest(UserDetails userDetails) throws Exception 
	{
		return delegateRequest(userDetails);
	}
	
	private String delegateRequest(UserDetails userDetails) throws Exception
	{
		verifyRequestType(userDetails);
		String response;
		switch (userDetails.getType()) 
		{
		
		case "CN":
					response = ReadChatBotMenuXML.MenuOptions(userDetails);
					return response;
		case "AN":
					response = ReadChatBotMenuXML.actionCall(userDetails); 
//					ReadChatBotMenuXML.actionExecution(userDetails.getCurrentNodeId());
					return response;
		default:
			break;
		}
		
		return"";

	}
	
	private void verifyRequestType(UserDetails userDetails) 
	{
		if(ApplicationConstatnt.actionNodeDetailsMap.containsKey(userDetails.getNextCallMap().get(userDetails.getLastMsg())))
		{
			userDetails.setType("AN");
			userDetails.setCurrentNodeId(userDetails.getNextCallMap().get(userDetails.getLastMsg()));
		}
	}
	
}
