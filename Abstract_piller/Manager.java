package Abstract_piller;

import java.util.ArrayList;

public class Manager {
   
	String Name;
	
//	ArrayList<Software> arr1;
//	ArrayList<Analyst> arr2;
//	
//	Manager(String Name){
//		this.Name=Name;
//		arr1=new ArrayList();
//		arr2= new ArrayList();
//	}
//	
//	public void addSoftware(Software s) {
//		s.Introduction();
//		arr1.add(s);
//	}
//	
//	public void addAnalyst(Analyst a) {
//		a.Introduction();
//		arr2.add(a);
//	}
	
	ArrayList<Employer> arr;
	Manager(String Name){
		this.Name= Name;
		arr= new ArrayList();
	}
	
	public void addEmployer(Employer e) {
		e.Introduction();
		arr.add(e);
	}
	
	
	
}
