/*import java.util.*;

public class condiionalsatetements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you  can vote");
        }else{
            System.out.println("you cannot vote");
        }
    }
    
} */
//LARGEST OF 2

/*import java.util.*;
public class condiionalsatetements{
    public static void main(String[] args) {
        int a=5;
        int b=7;
        if(a>=b){
            System.out.println("a is largest of two");
        }else{
            System.out.println("b is largest of two");
        }
    }

}*/

//PRINT IF A NUMBER IS EVEN OR ODD

/*import java.util.*;
public class condiionalsatetements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

    }
}*/

//ELSE IF

/*import java.util.*;
public class condiionalsatetements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }else if(age>=12&&age<18){
                System.out.println("teenager");
        }else{
             System.out.println("child");
        }
    }
}*/
//INCOME TAX CALCULATOR

/*import java.util.*;

public class condiionalsatetements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
            System.out.println("your tax amount is"+tax);
        }
        else if(income>=500000&&income<1000000){
            tax=(int)((income)*0.2);
            System.out.println("your tax amount is"+tax);
        }
        else{
            tax=(int)(income*0.2);
            System.out.println("your tax amount is"+tax);
        } 
    }

}*/
//PRINT LARGEST OF THREE NO.

/*import java.util.*;

public class condiionalsatetements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("num1 is largest of three");
        }
        else if(num2>num3){
            System.out.println("num 2 is largest of three");
        }
        else{
            System.out.println("num3 is largest of three");
        }
    }
}*/

//TERNARY OPERATOR

/*import java.util.*;
public class condiionalsatetements{
    public static void main(String args[]){
        int number=5;
        String type=((number%2)==0)?"even":"odd";
        System.out.println(type);
    }
}*/

//STUDENT REPORT CARD

import java.util.*;
public class condiionalsatetements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int marks4=sc.nextInt();
        int marks5=sc.nextInt();
        int avg=(marks+marks2+marks3+marks4+marks5)/5;
        if(avg>=95){
            System.out.print("your grade is A+");
        }
        else if(avg>=85&&avg<95){
            System.out.println("your grade is A");
        }
        else{
            System.out.println("your grade is B");
        }

    }
}