package com.myspring.s3;

public class MySingleTon {

	//private static MySingleTon mySingleTon;

	public MySingleTon() {
		System.out.println("constructor called....");
	}
	/*
	public static MySingleTon netIntance() {
		if(mySingleTon==null) {
			mySingleTon = new MySingleTon();
		}
		return mySingleTon;
	}
	*/
	public void display() {
		System.out.println("display method called");
	}
}
