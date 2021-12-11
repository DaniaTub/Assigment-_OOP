package com.hf.poly;

import java.sql.Time;

public class Log {
	
	private int  clientId;
	private String []description;
	private  long timestamp;
	private float  amount;
	
	//"client added"
     //"client removed"
	//"client balance updated – deposit"
	//"client balance updated – withdraw"
	//"account update – closed"
	//"account update – opened"
	//"bank auto account interest update"  
	
	public Log() {}
	





	public Log(int clientId, String[] description, long timestamp, float amount) {
		super();
		this.clientId = clientId;
		this.description = description;
		this.timestamp = timestamp;
		this.amount = amount;
	}



	public void printDetails() {
		toString();

	}




	@Override
	public String toString() {
		return "Log [clientId=" + clientId + ", description=" + description + ", time=" + amount + "]";
	}
	
	
	
	
	
	
	
}
