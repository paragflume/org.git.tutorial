package org.git.tutorial.test.test1.model;

public class Student {

	private String name;
	private String clas;
<<<<<<< HEAD
	private char gender;
=======
	private int roleNo = 0;
	private char section;
>>>>>>> refs/remotes/origin/org.git.tutorial

<<<<<<< HEAD
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClaz(String clas) {
		this.clas = clas;
	}

	public String getName() {
		return name;
	}

	public String getClas() {
		return clas;
=======
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(int roleNo) {
		this.roleNo = roleNo;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
>>>>>>> refs/remotes/origin/org.git.tutorial
	}

}
