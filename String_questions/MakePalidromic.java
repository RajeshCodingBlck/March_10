package String_questions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {

public static int MinCost(String str, int n){
    
    int [] fre= new int[256];
    for(int i=0; i<str.length();i++){
       
       char ch =str.charAt(i);
       int ascii=ch;
       fre[ascii]=fre[ascii]+1;
    }
    int count=0;
    // No of characters  whose frequency is odd.

    for(int i=0;i<fre.length ;i++){

        if(fre[i]%2 ==1){
            count++;
        }
    }
    if(count==0){
        return 0;
    }
   return count-1;
    }
    public static void main(String args[] ) throws Exception {

       Scanner s= new Scanner(System.in);
       int t= s.nextInt();

      for(int i=1; i<=t;i++){
        int n= s.nextInt();
        String str= s.next();
        System.out.println(MinCost(str,n));
      } 
    }
}

public class MakePalidromic {

}
