package Abstract_piller;

public class DevOps extends Employer {

	String Name;
	int id;
	
	DevOps(String Name, int id){
		this.Name=Name;
		this.id=id;
	}
	
	public void Introduction() {
		System.out.println("I am a DevOps Engineer");
	}

	
}
