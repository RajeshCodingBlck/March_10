package Abstract_piller;

public class Software extends Employer {
   
	 String Name;
	 int id;
	 
	 Software(String Name, int id){
		 this.Name=Name;
		 this.id=id;
	 }
	 
	 public void Introduction() {
		 System.out.println("hello I am a "+ 
	  Name+ "and I am in Software department ");
		 
	 }
	 
}
