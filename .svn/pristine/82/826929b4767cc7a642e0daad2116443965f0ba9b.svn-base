package com.vyomChatBot;

import java.io.Serializable;
import java.util.Comparator;

public class ActionNodeDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String actionId;
	public String actionClass;
	public String dataCollectionFile;
	
	public ActionNodeDetails(String actionId, String actionClass, String dataCollectionFile) {
		this.actionId = actionId;
		this.actionClass = actionClass;
		this.dataCollectionFile = dataCollectionFile;
	}
	public String getActionId() {
		return actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	public String getActionClass() {
		return actionClass;
	}
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	public String getDataCollectionFile() {
		return dataCollectionFile;
	}
	public void setDataCollectionFile(String dataCollectionFile) {
		this.dataCollectionFile = dataCollectionFile;
	}
	
	public static final Comparator<ActionNodeDetails> indexComparator = new Comparator<ActionNodeDetails>() {
    	@Override
        public int compare(ActionNodeDetails o1, ActionNodeDetails o2) {
    		return o1.actionId.compareTo(o2.actionId);
        }
    };

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionClass == null) ? 0 : actionClass.hashCode());
		result = prime * result + ((actionId == null) ? 0 : actionId.hashCode());
		result = prime * result + ((dataCollectionFile == null) ? 0 : dataCollectionFile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActionNodeDetails other = (ActionNodeDetails) obj;
		if (actionClass == null) {
			if (other.actionClass != null)
				return false;
		} else if (!actionClass.equals(other.actionClass))
			return false;
		if (actionId == null) {
			if (other.actionId != null)
				return false;
		} else if (!actionId.equals(other.actionId))
			return false;
		if (dataCollectionFile == null) {
			if (other.dataCollectionFile != null)
				return false;
		} else if (!dataCollectionFile.equals(other.dataCollectionFile))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ActionNodeDetails [actionId=" + actionId + ", actionClass=" + actionClass + ", dataCollectionFile="
				+ dataCollectionFile + "]";
	}
    
}
