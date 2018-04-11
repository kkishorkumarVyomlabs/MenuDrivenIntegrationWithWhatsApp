package com.vyom.Actions;

import java.util.List;

import com.vyom.base.AbstractServiceImpl;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.DataCollectionDetails;

public class TwoNoMultiplication extends AbstractServiceImpl {

	public void preProcessing() {
		ChatBotLogger.logger.info("From TwoMultiplication preProcessing");
	}

	public String processing(List<DataCollectionDetails> dataCollectionList) {
		Integer result=1;
		for (DataCollectionDetails dataCollectionDetails : dataCollectionList) {
			result = result * Integer.parseInt(dataCollectionDetails.getUserInput());
		}
		
		ChatBotLogger.logger.info("Final result is : " + result);
		return result.toString();
	}

	public void postProcessing() {
		ChatBotLogger.logger.info("From TwoNoMultiplication postProcessing");
	}
	public void validateNum1Value(String input) {
		ChatBotLogger.logger.info("In TwoNoMultiplication class validate first Value : " + input);		
	}
	public void validateNum2Value(String input) {
		ChatBotLogger.logger.info("In TwoNoMultiplication class validate second Value : " + input);		
	}
	public void initExecute() {
		init();
		preProcessing();
	}
	
}
