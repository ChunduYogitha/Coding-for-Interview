Check the number is positive or negative 

  
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}

INPUT : 4
OUTPUT : Positive

  -----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------

Using for loop
  
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println()
        int a = sc.nextInt();
        if(a>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        }
        System.out.println("For loop is ended");
    }
}
INPUT :Enter n = 3
OUTPUT :2
        Positive
        -5
        Negative
        8
        Positive


-----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------
QUE : Using call method or functions for only one time
  
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        PosOrNeg(a);
    
    }

    static void PosOrNeg(int a) {
        
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
INPUT : 5
OUTPUT: Positive
        
  
  
  -----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------  -----------------------------------

  QUE : Using call method or functions for mutiple inputs 

  
  import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        int a = sc.nextInt();
        PosOrNeg(a);
    }
    }

    static void PosOrNeg(int a) {
        
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
INPUT : 2
OUTPUT : 9
        Positive
          -2
        Negative
