package org.git.tutorial.test.test1.model;

public class Student{

    private String name;
    private String clas;
    private int roleNo = 0;
    
    public void setName(String name){
      this.name = name;
    }
    
    public void setClaz(String clas){
      this.clas = clas;
    }
    
    public String getName(){
      return name;
    } 
    public String getClas(){
      return clas;
    }

	public void setRollNo(int rollNo){
		this.roleNo = rollNo;
	}
	public int getRollNo(){
		return roleNo;
	}

}
