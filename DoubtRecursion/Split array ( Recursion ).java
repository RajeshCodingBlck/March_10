import java.util.*;
public class Main {

    static int count=0;
	public static void get(int [] arr, int i, ArrayList<Integer> g1, int sum1,
	                                          ArrayList<Integer> g2, int sum2){
        

         if(i>=arr.length){

			 if(sum1==sum2){

				 for(int val : g1){
					 System.out.print(val+" ");
				 }
				 System.out.print("and ");
				  for(int val : g2){
					 System.out.print(val+" ");
				 }

				 System.out.println();
				 count++;
			 }
			 return ;
		 }

		// arr[i] ko Group1  me bhejte he...
		g1.add(arr[i]);
		get(arr, i+1,g1, sum1+arr[i], g2, sum2);
 		g1.remove(g1.size()-1);				 
		// arr[i] ko Group2 me bhejte he.									 
											 
		g2.add(arr[i]);
		get(arr, i+1,g1, sum1, g2, sum2+arr[i]);
 		g2.remove(g2.size()-1);									 
											 
											 
																					 
	 }
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);
		int n= s.nextInt();

		int [] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> g1= new ArrayList<>();
		ArrayList<Integer> g2= new ArrayList<>();
		get(arr, 0, g1,0, g2,0);
		System.out.println(count);

    }
}
