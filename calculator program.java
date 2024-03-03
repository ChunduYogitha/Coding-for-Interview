import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int ans = 0;
       while(true){
           System.out.print("Enter the operator : ");
           char op = sc.next().trim().charAt(0);
          if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
              System.out.print("Enter two numbers : ");
              int n1 = sc.nextInt();
              int n2 = sc.nextInt();
              if(op == '+'){
                  ans = n1+n2;
              }
              if(op == '-'){
                  ans = n1-n2;
              }
              if(op == '*'){
                  ans = n1*n2;
              }
              if(op == '/'){
                  if(n2 != 0){
                      ans = n1/n2;
                  }
              }
              if(op == '%'){
                  ans = n1%n2;
              }
              
          }
          else if(op == 'x' || op == 'X'){
              break;
          }
          else{
              System.out.println("Invalid");
          }
          System.out.println(ans);
       }
    }
}

/*

  Enter the operator : +
  Enter two numbers : 2 3
  6
Enter the operator : @
Invalid
Enter the operator : %
Enter two numbers : 25 5
0
Enter the operator : $
Invalid
Enter the operator : x


