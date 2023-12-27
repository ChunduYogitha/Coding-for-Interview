import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        while(n!=0){
            n=n/10;
            if(n!=0)
                count++;
        }
        System.out.println(count);
        
    }
}
/*
 INPUT:221
OUTPUT : 3
*/
