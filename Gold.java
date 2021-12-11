package com.hf.poly;

public class Gold extends Client {
	//gold clients pays a commission rate of 2%

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	//	super.comissionRate=(float) 0.02;
	//	super.interestRate=(float) 0.03;


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
		//gold clients gets a daily interest rate of 0.3%
		 return (int) ((int) super.getBalance()*interestRate);
	}
	
	

}
