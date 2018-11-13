package net.antra.controller1;

public  class Student extends Object{

	 private int rollno;
	private String name;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}	
	
	private int getRollNo() {
		
		return this.rollno;
	}
	
	public boolean equals(Object o) {
		
		Student st1=(Student)o;
		
		String name1=st1.name;
		int rollNo1=st1.rollno;
		
		String name2=this.name;
		int rollNo2=this.rollno;
		
		if(name1.equals(name2) && rollNo1==rollNo2) {
			return true;
		}else {
			return false;
		}
	}
/*	public int hashCode() {
		
		return 112345;
	}
	public String toString() {
		
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
}
