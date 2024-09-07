package OOP_1;

public class Ac {
   
	
	
	// State
	 boolean Start;
	 int temp;
	 String swing;
	 int fanSpeed;
	 
	 Ac(){
		 Start=false;
		 temp=24;
		 swing="left";
		 fanSpeed=12;
	 }
	 Ac(boolean val1, int val2, String val3, 
			 int val4){
		
		 Start=val1;
		 temp=val2;
		 swing=val3;
		 fanSpeed=val4;
	  }
	
	
	// Behaviour
	 void SwitchMode() {
		 if(Start==true) {
			 Start=false;
		 }else {
			 Start=true;
		 }
	 }
	 
	 void Increase() {
		 if(temp==30) {
			 return;
		 }
		 temp++;
		 
	 } 
	 void Decrease() {
		 if(temp==16) {
			 return;
		 }
		 temp--;
	 }
	 
}
