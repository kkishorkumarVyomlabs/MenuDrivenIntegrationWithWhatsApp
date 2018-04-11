package com.vyom.Actions;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.List;

import com.vyom.base.AbstractServiceImpl;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.DataCollectionDetails;

public class SamosaData extends AbstractServiceImpl{
	
	public void preProcessing() 
	{
		ChatBotLogger.logger.info("From Samosa data preProcessing");
	}
	
	public String processing(List<DataCollectionDetails> dataCollectionList) 
	{
		String response="Your have ordered ";
		
		//Integer result=0;
		for (DataCollectionDetails dataCollectionDetails : dataCollectionList) 
		{
			response = response + dataCollectionDetails.getUserInput()+ " Samosa ";
			
		}
		
		ChatBotLogger.logger.info("Final result is : " + response);
		return response;
	}
	public void postProcessing()
	{
		ChatBotLogger.logger.info("From Samosa data postProcessing");
	}
	
	
	
	public void validateSamosaTypeValue(String input) throws Exception 
	{
		if(Integer.parseInt(input)>0) 
		{
		ChatBotLogger.logger.info("In SamosaData class validate first Value :" + input);
		//System.out.println("In paneerData class validate second Value : " + input);
	    }
			
	}
	public void initExecute()
	{
		init();
		preProcessing();
	}

}
