
*  Using ( while loop ) printing the statement inside the loop
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = 0;
                int n2 = 1;
                int count =2;
                while(count<=n){
                    int temp = n2;
                    n2 = n2 + n1;
                    n1 = temp;
                    count ++;
                    System.out.println(n2 + " ");
                }
            }
        }
        INPUT : 7
        OUTPUT : 1 2 3 5 8 13 

*  Using(While loop ) printing the statement outside the loop
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = 0;
                int n2 = 1;
                int count =2;
                while(count<=n){
                    int temp = n2;
                    n2 = n2 + n1;
                    n1 = temp;
                    count ++;
                    System.out.println(n2);
                    }
            }
        }
        INPUT : 7
        OUTPUT : 13



*  Taking n1 and n2 as 0 and 1 using (for loop) writting print statement inside the loop
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = 0;
                int n2 = 1;
                for(int count=2;count<=n;count++){
                    int temp = n2;
                    n2 = n2 + n1;
                    n1 = temp;
                    System.out.println(n2);
                } 
            }
        }
        INPUT : 7
        OUTPUT :1
                2
                3
                5
                8
                13
        
*  Taking n1 and n2 as 0 and 1 using (for loop) writting print statement outside the loop
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = 0;
                int n2 = 1;
                for(int count=2;count<=n;count++){
                    int temp = n2;
                    n2 = n2 + n1;
                    n1 = temp;
                    System.out.println(n2);
                } 
                 System.out.print(n2);
            }
        }
        INPUT : 7
        OUTPUT : 13

*  Taking  n1 and n2 as -1 and 1
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = -1;
                int n2 = 1;
                for(int count=2;count<=n;count++){
                    int temp = n2;
                    n2 = n2 + n1;
                    n1 = temp;
                    System.out.println(n2);
                }
            }
        }
        INPUT : 7
        OUTPUT : 0
                 1
                 1
                 2
                 3
                 5

*  Taking single value 0
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
           OUTPUT : 0
                    1
                    3
                    6
                    10
                    15
