package Abstract_piller;

public class Analyst extends Employer {
   
	String Name;
	 int id;
	 Analyst(String Name, int id){
		 this.Name=Name;
		 this.id=id;
	 }
	 
	 public void Introduction() {
		 System.out.println("hello I am a "+ 
	  Name+ "and I am in Analyst department ");
		 
	 }
}
