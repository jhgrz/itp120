package carpet;

import java.text.*;

public class RoomDimension {
	// instance variables
	private double roomLen;
	private double roomWid;
	
	// constructors
	public RoomDimension() {
		
	}
	
	public RoomDimension(double len, double wid) {
		this.roomLen = len;
		this.roomWid = wid;
	}
	
	// methods
	public String toString() {
		return "The room is " + new DecimalFormat("#.0").format(this.roomLen) + 
			" feet long X " + new DecimalFormat("#.0").format(this.roomWid) + 
			" feet wide.";
	}
	
	public double getArea() {
		return this.roomLen * this.roomWid;
	}

	// getters and setters
	public double getRoomLen() {
		return roomLen;
	}

	public void setRoomLen(double roomLen) {
		this.roomLen = roomLen;
	}

	public double getRoomWid() {
		return roomWid;
	}

	public void setRoomWid(double roomWid) {
		this.roomWid = roomWid;
	}
	
}
