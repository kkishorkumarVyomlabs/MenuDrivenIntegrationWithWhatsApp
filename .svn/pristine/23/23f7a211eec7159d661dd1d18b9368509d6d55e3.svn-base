package com.vyom.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

import com.vyom.Actions.ThreeNoAddition;
import com.vyom.chatbot.core.ChatBotLogger;

import noNamespace.AEChatBotMenuDocument.AEChatBotMenu.MenuNode.ActionNode;
import noNamespace.AEChatBotMenuDocument.AEChatBotMenu.MenuNode.ActionNode.DataCollection.DataNode;

public abstract class AbstractServiceImpl implements BaseService{
	public ArrayList<String> userDataList = new ArrayList<String>() ;

	public void init() {
		ChatBotLogger.logger.info("From AbstractServiceImpl inIt");
	}

	public  void dataCollection(ActionNode actionNode) {
		
		DataNode[] DataNodeArray = actionNode.getDataCollection().getDataNodeArray();
		for (DataNode dataNode : DataNodeArray) {
			ChatBotLogger.logger.info(dataNode.getDisplayText());
			String userInput = new Scanner(System.in).nextLine(); 
			if(!validateField(this.getClass().getName(), dataNode.getValidationMethod(), userInput)) {break;}else {
				userDataList.add(userInput);
			}
		}

		ChatBotLogger.logger.info("User Provided value :- " + userDataList.toString() );
	}
	
	public boolean validateField(String className, String methodName, String userInput) {
		Class cls;
		try {
			cls = Class.forName(className);
			Object obj = cls.newInstance();
			Method method = cls.getDeclaredMethod(methodName, String.class);
			method.invoke(obj, userInput);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}


	public void preProcessing() {
		ChatBotLogger.logger.info("From AbstractServiceImpl preProcessing");
	}

	public void processing() {
		ChatBotLogger.logger.info("From AbstractServiceImpl processing");
	}

	public void postProcessing() {
		ChatBotLogger.logger.info("From AbstractServiceImpl postProcessing");
	}

	public void response() {
		ChatBotLogger.logger.info("From AbstractServiceImpl response");
	}
	
	public void close() {
		ChatBotLogger.logger.info("From AbstractServiceImpl close");
	}
	
	public void execute(ActionNode obj) {		
		init();
		preProcessing();
		dataCollection(obj);
		processing();
		postProcessing();
		response();
		close();
	}
}
