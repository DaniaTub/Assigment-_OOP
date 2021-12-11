package com.hf.poly;

import java.util.ArrayList;

public abstract  class Client  {
 private int id;
 private String name;
 private float balance ;
 //rank ..
 private ArrayList clientAcoount; 
protected final float  comissionRate; // ?
protected final float interestRate; // ?
 Logger logger;
 
 Account Acc=new Account();

 
 
public Client() {
	this.comissionRate = 0;
	this.interestRate = 0;}
public Client( int id, float balance) {
	this.comissionRate = 0;
	this.interestRate = 0;
}

public Client( int id, float balance, int id2, String name, float balance2, ArrayList[] clientAcoount,
		float comissionRate, float interestRate) {
	id = id2;
	this.name = name;
	balance = balance2;
	this.clientAcoount = clientAcoount[5];
	this.comissionRate = 0;
	this.interestRate = 0;
}

public Client( int id, float balance, int id2, String name, float balance2) {
	id = 0;
	this.name = name;
	this.comissionRate = 0;
	this.interestRate = 0;
	balance = 0;
}
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getBalance() {
	return balance;
}

public void setBalance(float balance) {
	this.balance = balance;
}

public ArrayList getClientAcoount() {
	return clientAcoount;
}


public void setClientAcoount(ArrayList clientAcoount) {
	this.clientAcoount = clientAcoount;
}

public Account getAccount(int id ) {
	//Account m=new Account(name, id, balance);
	
	if(Acc.getId()==id) {
		return Acc;
		
	}
	else return null;
}



public float getFotune() {
	 //returns the sum of client balance + total accounts balance
		 return (balance+ Acc.getBalance());
 }
	
 public void addAcoount(Account j) {
	 //seek the array and place the account where is the first null value
	 clientAcoount.add(j);

 }
	
//remove account – money is transferred to the clients balance – no change in the bank total balance
	public void removeAccount(int id) {
		//Acc.balance transfered to client balance
		
		for(int i=0; i<clientAcoount.size();i++) {
			if(clientAcoount.equals(clientAcoount)) {
			    clientAcoount.remove(Acc); 
			    balance=Acc.getBalance();
			  //  Log();

				//oLog the operation via creating Log object with appropriate data and sending it to the Logger.log(..) method.
			}
		}
		
	    
	}
	
	public   float withDraw() {
		// remove
		
		
		return  Bank.updateTotalCommission(balance);
	}
	
	public  abstract  int deposit() ;
		//to add
	public  abstract  int udpadte() ;
		
}
