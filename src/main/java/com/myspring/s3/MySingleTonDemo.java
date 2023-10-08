package com.myspring.s3;

public class MySingleTonDemo {

	public static void main(String[] args) {
		/*
		MySingleTon obj1 = MySingleTon.netIntance();
		obj1.display();
		
		MySingleTon obj2 = MySingleTon.netIntance();
		obj2.display();
		*/
		MySingleTon obj1 = new MySingleTon();
		obj1.display();
		
		MySingleTon obj2 = new MySingleTon();
		obj2.display();
	}

}
