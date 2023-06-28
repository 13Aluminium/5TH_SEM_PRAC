import java.util.*;  
    
    class FibonacciExample{  
     public static void main(String args[]){  
        Scanner sc= new Scanner(System.in); 
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

     }  
    }  



        class FibonacciExample2{  
     static int fibonacci(int n){    
        
            if(n==0)
            
                return 0;
            if(n==1)
                return 1;
            else{
                // System.out.print(n);
                return(fibonacci(n-1)+fibonacci(n-2));
                
            }
        
     }    
     public static void main(String args[]){  
        Scanner sc= new Scanner(System.in); 
        int n = sc.nextInt();
        int fib;

         fib  = fibonacci(n);
        System.out.print(fib);
        
     }  
    }  