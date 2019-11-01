package com.sist.var;

/**
 * 변수: Variable
 * 
 * @author sist1
 *
 */
public class Var01 {
    //변수: 전역변수
	public static void main(String[] args) {
		//변수: 지역변수
		int age; 
		age = 21; //변수 초기화
		
		int year = 2019;
		
		System.out.println("age: "+age);
		System.out.println("year:"+year);
		
		System.out.println("--------------------");
		age  = age+1;
		year = year +1; 
		
		
		System.out.println("age: "+age);
		System.out.println("year:"+year);

	}

}
