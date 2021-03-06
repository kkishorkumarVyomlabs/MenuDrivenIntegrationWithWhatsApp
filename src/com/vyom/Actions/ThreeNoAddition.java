package com.vyom.Actions;

import java.util.List;

import com.vyom.base.AbstractServiceImpl;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.DataCollectionDetails;

public class ThreeNoAddition extends AbstractServiceImpl {
	
	public void init() {
		ChatBotLogger.logger.info("From ThreeNoAddition init");
	}

	public void preProcessing() {
		ChatBotLogger.logger.info("From ThreeNoAddition preProcessing");
	}

	public String processing(List<DataCollectionDetails> dataCollectionList) {
		Integer result=0;
		for (DataCollectionDetails dataCollectionDetails : dataCollectionList) {
			result = result + Integer.parseInt(dataCollectionDetails.getUserInput());
		}
		
		ChatBotLogger.logger.info("Final result is : " + result);
		return result.toString();
	}

	public void postProcessing() {
		ChatBotLogger.logger.info("From ThreeNoAddition postProcessing");
	}
	
	public void validateNum1Value(String input) {
		if(Integer.parseInt(input)>0) {
//			ChatBotLogger.logger.info("In ThreeNoAddition class validate first Value : " + input);
			System.out.println("In ThreeNoAddition class validate first Value : " + input);
		}
	}
	public void validateNum2Value(String input) {
		ChatBotLogger.logger.info("In ThreeNoAddition class validate second Value : " + input);		
	}
	public void validateNum3Value(String input) {
		ChatBotLogger.logger.info("In ThreeNoAddition class validate third Value : " + input);		
	}
	
	public void initExecute() {
		init();
		preProcessing();
	}
}
