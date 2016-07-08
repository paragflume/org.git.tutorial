package org.git.tutorial.test.test1.controller;

public class Logic {
	
	public void logic1(){
		for(int a = 10; a >0 ; a--){
			System.err.println();
			for(int b = 1 ; b < a ; b++){
				System.err.print(" $ ");
			}
		}
	}
	
	public void logic2(){
		for(int a = 0; a < 10 ; a++){
			System.err.println();
			for(int b = 1 ; b <= a ; b++){
				System.err.print(" * ");
			}
		}
	}

}
