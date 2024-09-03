import java.util.*;
public class Main {

    public static int get(int [] arr, int c1, int c2){

        int ans=0;
        for(int i=0; i<arr.length;i++){
             
             int currans=  Math.min(c1*arr[i] , c2);
             ans+=currans;
        }
        return ans;
    }

    public static void main(String args[]) {

       Scanner s= new Scanner(System.in);

       int t= s.nextInt();
       
       while(t>0){

          int c1= s.nextInt();
          int c2=s.nextInt();
          int c3=s.nextInt();
          int c4=s.nextInt();

          int n=s.nextInt(); // No of Rickshaw
          int m= s.nextInt(); // no of Cab
          int [] Rickshaw= new int [n];
          int [] Cab= new int[m];

          for(int i=0; i<n;i++){
              Rickshaw[i]=s.nextInt(); // No of rides required in ith ricksaw
          }
          for(int i=0; i<m;i++){
              Cab[i]=s.nextInt();  // no of rides required in ith Cab
          }
           int Min_c1_c2_forRicksaw= get(Rickshaw, c1, c2);
           int Min_c1_c2_c3_forRicksaw= Math.min(Min_c1_c2_forRicksaw, c3);


           int Min_c1_c2_forCab= get(Cab, c1, c2);
           int Min_c1_c2_c3_forCab= Math.min(Min_c1_c2_forCab, c3);

           int finalAns= Math.min(Min_c1_c2_c3_forCab+ Min_c1_c2_c3_forRicksaw, c4);
           System.out.println(finalAns);


           t--;
       }

    }
}
