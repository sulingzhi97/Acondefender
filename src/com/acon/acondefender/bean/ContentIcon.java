package com.acon.acondefender.bean;

public class ContentIcon {
	private int itemID;
	private int stringID;
	private int sourceID;

	public ContentIcon() {
	}

	public ContentIcon(int stringID, int sourceID, int itemID) {
		this.stringID = stringID;
		this.sourceID = sourceID;
		this.itemID = itemID;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int stringID) {
		this.itemID = stringID;
	}

	public int getStringID() {
		return stringID;
	}

	public void setStringID(int stringID) {
		this.stringID = stringID;
	}

	public int getSourceID() {
		return sourceID;
	}

	public void setSourceID(int sourceID) {
		this.sourceID = sourceID;
	}

}
