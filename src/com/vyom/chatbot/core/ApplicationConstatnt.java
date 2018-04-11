package com.vyom.chatbot.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import noNamespace.AEChatBotMenuDocument.AEChatBotMenu.MenuNode.ActionNode;

public class ApplicationConstatnt {
	
	public static Scanner scanner = new Scanner(System.in); 
	public static Map<String, ActionNode> actionNodeDetailsMap = new HashMap<String, ActionNode>();
	public static String baseActionPackage = "com.vyom.Actions.";
	public static String methodName = "execute";
	public static Map<String, UserDetails> userDetailsMap = new HashMap<String, UserDetails>();
	

}
