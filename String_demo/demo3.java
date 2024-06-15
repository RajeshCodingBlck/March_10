package String_demo;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 ="Hello";
//		String str2 ="Hello";
		
		String str1= new String("Hello");
		String str2= new String("Hello");

		if (str1 == str2) {
			System.out.println("Me Same hu");
		} else {
			System.out.println("BHai Same nahi hu");
		}
		
		str1= str1+"e";
		System.out.println(str1);
		System.out.println(str2);
	}

}
