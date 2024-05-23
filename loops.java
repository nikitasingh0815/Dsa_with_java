/*import java.util.*;

public class loops {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is npt prime");
            }
        } 
    }
    
    
}*/

///////////////////////////////////////////

/*public class loops{
    public static void main(String args[]){
        int i=0;
        while(i<5){
            System.out.println("hello");
            i++;
        }
    }
}*/

////////////////////////////////////

/*public class loops{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
    }
}*/

/////////////////////////////////////

/*import java.util.*;
public class loops{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}*/

/////////////////////////////////////////////

import java.util.*;
public class loops{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter number:");
         int n=sc.nextInt();
         int i=0;
         int sum=0;
    
         while( i<=n){
            sum=sum+i;
            
            i++;
         }
         System.out.println(sum);
    }
    
    

}