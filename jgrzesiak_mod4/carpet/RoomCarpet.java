package carpet;

import java.text.*;

public class RoomCarpet {
	// instance variables
	private double costPerSqFt;
	private RoomDimension roomDim;
	
	// constructors
	public RoomCarpet() {
		
	}
	
	public RoomCarpet(double cost, RoomDimension rd) {
		this.costPerSqFt = cost;
		this.roomDim = rd;
	}
	
	// methods
	public String toString() {
		return "The carpet costs " + 
			NumberFormat.getCurrencyInstance().format(this.costPerSqFt) +
			" per square foot. " + this.roomDim.toString();
	}
	
	public double getTotalCost() {
		return this.costPerSqFt * this.roomDim.getArea();
	}

	// getters and setters
	public double getCostPerSqFt() {
		return costPerSqFt;
	}

	public void setCostPerSqFt(double costPerSqFt) {
		this.costPerSqFt = costPerSqFt;
	}

	public RoomDimension getRoomDim() {
		return roomDim;
	}

	public void setRoomDim(RoomDimension roomDim) {
		this.roomDim = roomDim;
	}
}
