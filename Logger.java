package com.hf.poly;

public class Logger{

	private String driverName;
	static Log log=new Log(); //??statice
	
	
	//functionality log, getLog ..
	
	
	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	
	public static  void Log() {
		log.printDetails();
		
	}
	
	public void getLogs() {
		
	}
	
	
}
