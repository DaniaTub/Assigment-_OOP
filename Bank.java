package com.hf.poly;

import java.util.ArrayList;

public  class Bank { // singilton

	private static  float  totalCommission;

	private ArrayList clients;
	private Logger logService;

	Client cli =new Client( int id , getBalance());

	
	 
	public static  float updateTotalCommission(float  totalCommission) {
		
// sum all commissions due to client withdraw & deposit operations. 
        if (totalCommission== 0.0)
        	totalCommission =withDraw()+deposit();
 
        return totalCommission;
    }
	

    private Bank() {}


    public Bank( ArrayList clients, Logger logService) {
		
		this.clients = clients;
		this.logService = logService;
	}
public float getBalance() {
	

	return cli.getFotune();
}


public void  addClient(Client cl) {
	
	
	clients.add(cl);
	
}

public void printClientList() {
	toString();
	
}






@Override
public String toString() {
	return "Bank [clients=" + clients + ", logService=" + logService + ", cli=" + cli + ", id=" + id + ", getBalance="
			+ getBalance + "]";
}

public void removeClient(int id ) {

	for(int i=0; i<clients.size();i++) {
		if(cli.equals(obj)) 
			{
			clients.remove(cli); 
			}
}

}




@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}



public Float setBalance() {
	//Update setBalance() to add the commissionSum to the bank total balance 
}


	public static int withDraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	public  static int deposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int udpadte() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
