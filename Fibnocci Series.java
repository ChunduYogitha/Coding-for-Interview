import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
            System.out.println(sum);
        }
    }
}
/*
   INPUT:5
   OUTPUT : 1
            3
            6
            10
            15
