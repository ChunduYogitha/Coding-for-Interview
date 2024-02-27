* print the number in reverse 
    
    import java.io.*;
    public class Main{
        public static void main(String[] args){
            int n = 2564;
            int sol = 0;
            while(n>0){
                int rem = n%10;
                n = n/10;
                sol = sol * 10 + rem;  
            }
            System.out.println(sol);
        }
    }
/*
OUTPUT : 4652
*/

* Count no.of digits
    
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n=n/10;
             count++;
        }
        System.out.println(count);
        
    }
}
/*
 INPUT:221
OUTPUT : 3
*/

*count no.of 5's in the number
import java.io.*;
public class Main{
    public static void main(String[] args){
        int n = 45536;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 5){
            count ++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

/* 
Output : 2
*/
