package com.vyom.chatbot.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserDetails implements Serializable{

	private Map<String,String> nextCallMap = new HashMap<String,String>();
	/*private String position = "";
	private String displayText = "";
	private String childId = "";*/
	private String id = "";
	private String type = "";
	private String currentNodeId = "";
	private String parentId = null;
	private String userNumber;
	private String lastMsg="";
	private ActionDetails actionDetails;
	private String lastParamAsked="";
	
	
	public UserDetails (String userNo) {
		this.userNumber = userNo;
		this.type = "CN";
	}
	
	public UserDetails() {}
	
	public Map<String, String> getNextCallMap() {
		return nextCallMap;
	}
	public void setNextCallMap(Map<String, String> nextCallMap) {
		this.nextCallMap = nextCallMap;
	}
	/*public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	public String getChildId() {
		return childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrentNodeId() {
		return currentNodeId;
	}
	public void setCurrentNodeId(String currentNodeId) {
		this.currentNodeId = currentNodeId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getLastMsg() {
		return lastMsg;
	}

	public void setLastMsg(String lastMsg) {
		this.lastMsg = lastMsg;
	}

	public ActionDetails getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(ActionDetails actionDetails) {
		this.actionDetails = actionDetails;
	}


	public String getLastParamAsked() {
		return lastParamAsked;
	}

	public void setLastParamAsked(String lastParamAsked) {
		this.lastParamAsked = lastParamAsked;
	}
	
}
