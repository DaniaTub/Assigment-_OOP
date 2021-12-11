package com.hf.poly;

public class Platinum  extends Client {

	//platinum clients pays a commission rate of 1%
	public Platinum() {
		super();
		// TODO Auto-generated constructor stub
	//	super.comissionRate=(float) 0.01;
	//	super.interestRate=(float) 0.05;


	}

	@Override
	public float withDraw() {
		// TODO Auto-generated method stub
			 return (int) ((int) super.getBalance()+comissionRate); // add money ??

	}

	@Override
	public int deposit() {
		// TODO Auto-generated method stub
		 return (int) ((int) super.getBalance()-comissionRate); // add money ??

	}

	@Override
	public int udpadte() {
		// TODO Auto-generated method stub
		//platinum clients gets a daily interest rate of 0.5%
		 return (int) ((int) super.getBalance()*interestRate);
	}

	
	
	
	
	
}
