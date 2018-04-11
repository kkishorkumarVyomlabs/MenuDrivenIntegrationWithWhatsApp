package com.vyom.whatsapp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.vyom.broadcast.BroadcastHi;
import com.vyom.chatbot.core.ChatBotLogger;
import com.vyom.chatbot.core.RequestDispatcher;
import com.vyomChatBot.DriverUtility;
import com.vyomChatBot.WhatsApp;

public class whatsAppMain
{
	public static WebDriver driver = null;
	public static boolean init = false;
	public static int browserType;
	public static String browserLocation = "tools//chromedriver.exe";

	
	public static void main(String args[])
	{
		ChatBotLogger.LogGenerator();
		whatsAppMain whtAppMainObj = new whatsAppMain();
		whtAppMainObj.cleanBrowser();
		do
		{
			whtAppMainObj.init(browserLocation);
			
		}while(driver == null);
		
		WhatsApp whatsAppAccount = new WhatsApp();
		//BroadcastHi br=new BroadcastHi();
		//RequestDispatcher rd=new RequestDispatcher();
		try 
		{   
			whatsAppAccount.userList();
			//Thread.sleep(10000);
			//br.userList();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	public void cleanBrowser() {
		
		try { 
			Process p = Runtime.getRuntime().exec("Taskkill /f /im chromedriver.exe");
			p = Runtime.getRuntime().exec("Taskkill /f /im chrome.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void init(String browserLocation) 
	{
		ChatBotLogger.logger.info("Startig INIT ");
		driver = DriverUtility.getDriver(browserLocation);		//Driver Type and Location			
	}
}
