package com.vyom.Actions;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.List;

import com.vyom.base.AbstractServiceImpl;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.DataCollectionDetails;

public class SoftDrinkData extends AbstractServiceImpl{
	
	public void preProcessing() 
	{
		ChatBotLogger.logger.info("From SoftDrink data preProcessing");
	}
	
	public String processing(List<DataCollectionDetails> dataCollectionList) 
	{
		String response="Your soft drink is: ";
		
		//Integer result=0;
		for (DataCollectionDetails dataCollectionDetails : dataCollectionList) 
		{
			response = response + dataCollectionDetails.getUserInput() + " and Quantity is:";
			
		}
		
		ChatBotLogger.logger.info("Final result is : " + response);
		return response;
	}
	public void postProcessing()
	{
		ChatBotLogger.logger.info("From SoftDrink data postProcessing");
	}
	
	
	
	public void validateSoftDrinkTypeValue(String input) throws Exception 
	{
			NumberFormat numberFormatter = NumberFormat.getInstance();
	        ParsePosition parsePosition = new ParsePosition(0);
	        numberFormatter.parse(input, parsePosition);
	        
	        if(input.length() == parsePosition.getIndex()) 
	        { 
	        	//System.out.println("It is a number");
	        	throw new Exception();
	            
	        } else 
	        {
	           // System.out.println("It is a not number");
	            ChatBotLogger.logger.info("In SoftDrinkData class validate first Value : " + input);
	        }
		/*if(!(Integer.parseInt(input) > 0)){
			throw new Exception();
		}*/
		//ChatBotLogger.logger.info("In paneerData class validate first Value : " + input);		
	}
	
	public void validateSoftDrinkQuantityValue(String input) throws Exception
	{
		if(Integer.parseInt(input)>0) 
		{
		ChatBotLogger.logger.info("In SoftDrinkData class validate second Value :" + input);
		//System.out.println("In paneerData class validate second Value : " + input);
	    }
		
		//ChatBotLogger.logger.info("In paneerData class validate second Value : " + input);		
	}
	public void initExecute()
	{
		init();
		preProcessing();
	}


}
