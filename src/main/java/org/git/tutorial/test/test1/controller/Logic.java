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
				System.err.print(" # ");
			}
		}
	}
	
	public static void main(String[] args) {
		Logic logic = new Logic();
		logic.logic1();
		logic.logic2();
		
	}
	
	public void logic3(){
		int limie = 10;
		for(int a = 0; a > limit ; a--){
			System.err.println();
			for(int b = 0 ; b < limit ; b--){
				if(b<a){
					System.err.print("   ");
				}else{
					System.err.print(" * ");
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Logic logic = new Logic();
		logic.logic3();
		logic.logic2();
		logic.logic1();
		
		
	}

}
