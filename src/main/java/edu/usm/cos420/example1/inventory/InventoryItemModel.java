package edu.usm.cos420.example1.inventory;

public class InventoryItemModel {
	int ID;
	String description;
	
	private InventoryItemModel(int itemID, String itemDetail) {
		ID = itemID;
		description = itemDetail;
	}
	
	//getters
	public int getID() {
		return this.ID;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	//setters
	public void setID(int id) {
		this.ID = id;
	}
	
	public void setDescription(String detail) {
		this.description = detail;
	}
}
