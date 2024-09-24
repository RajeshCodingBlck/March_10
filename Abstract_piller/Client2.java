package Abstract_piller;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Manager Akash = new Manager("Akash");
       Software reet= new Software("reet", 12);
       Analyst Akshit = new Analyst("Akshit", 13);
       
//       Akash.addSoftware(reet);
//       Akash.addAnalyst(Akshit);
       
        Akash.addEmployer(reet);
        Akash.addEmployer(Akshit);
        
       DevOps neha= new DevOps("Neha", 14);
       
       Akash.addEmployer(neha);
       
	}

}
