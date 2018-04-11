package com.vyom.Actions;

import java.util.List;

import com.vyom.base.AbstractServiceImpl;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.DataCollectionDetails;

public class TwoNoSubstraction extends AbstractServiceImpl {
	

	public void preProcessing() {
		ChatBotLogger.logger.info("From TwoNoSubstraction preProcessing");
	}

	public String processing(List<DataCollectionDetails> dataCollectionList) {
		Double result = Double.parseDouble(dataCollectionList.get(0).getUserInput()) - Double.parseDouble(dataCollectionList.get(1).getUserInput());
		ChatBotLogger.logger.info("Final result is : " + result);
		return result.toString();
	}
	
	public void postProcessing() {
		ChatBotLogger.logger.info("From TwoNoSubstraction postProcessing");
	}
	public void validateNum1Value(String input) {
		ChatBotLogger.logger.info("In TwoNoSubstraction class validate first Value : " + input);		
	}
	public void validateNum2Value(String input) {
		ChatBotLogger.logger.info("In TwoNoSubstraction class validate second Value : " + input);		
	}
	public void initExecute() {
		init();
		preProcessing();
	}
}
