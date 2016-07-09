package org.git.tutorial.test.test1.controller;

public class Logic {
	
	public void logic1(){
		for(int a = 10; a >0 ; a--){
			System.err.println();
			for(int b = 1 ; b < a ; b++){
<<<<<<< HEAD
				System.err.print(" W ");
				System.err.print(" X ");
				System.err.print(" Y ");
				System.err.print(" Z ");
=======
				System.err.print(" A ");
				System.err.print(" A ");
				System.err.print(" A ");
				System.err.print(" A ");
>>>>>>> branch 'org.git.tutorial' of https://github.com/paragflume/org.git.tutorial.git
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
	
	public void logic3(){
		int limit = 10;
		for(int a = limit; a >= 1 ; a--){
			System.err.println();
			for(int b = 1 ; b <= limit ; b++){
				if(b<a){
					System.err.print("   ");
				}else{
					System.err.print(" * ");
				}
			}
		}
	}
	
	public void logic4(){
		int limit = 10;
		for(int a = 1; a <= limit ; a++){
			System.err.println();
			for(int b = 1 ; b <= limit ; b++){
				if(b<=a){
					System.err.print("   ");
				}else{
					System.err.print(" @ ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Logic logic = new Logic();
		logic.logic2();
		logic.logic1();
		logic.logic3();
		logic.logic4();
	}

}
