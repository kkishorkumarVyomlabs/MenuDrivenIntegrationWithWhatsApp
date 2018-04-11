package com.vyomChatBot;

public class ContainerDisplayNodeDetails {
	
	public String UniqueId;
	public String childId;
	public String name;
	public String position;
	public String actionId;
	public String displayText;
	
	public String getUniqueId() {
		return UniqueId;
	}
	public void setUniqueId(String uniqueId) {
		UniqueId = uniqueId;
	}
	public String getChildId() {
		return childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getActionId() {
		return actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
	@Override
	public String toString() {
		return "ContainerDisplayNodeDetails [UniqueId=" + UniqueId + ", childId=" + childId + ", name=" + name
				+ ", position=" + position + ", actionId=" + actionId + ", displayText=" + displayText + "]";
	}
}
