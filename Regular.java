package com.hf.poly;

public class Regular  extends Client 
{

//regular clients pays a commission rate of 3%
	public Regular() {
		super();
		//super.comissionRate=(float) 0.03;
		//super.interestRate=(float) 0.01;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public float withDraw() {
		// TODO Auto-generated method stub
		 return (int) ((int) super.getBalance()+comissionRate); // add money ??
		
		
	}

	@Override
	public int  deposit() {
		// TODO Auto-generated method stub
		return (int) ((int) super.getBalance()-comissionRate);
	}


	@Override
	public int udpadte() {
		// TODO Auto-generated method stub
		//regular clients gets a daily interest rate of 0.1%
		 return (int) ((int) super.getBalance()*interestRate);
	}

	
	
	
	
}
