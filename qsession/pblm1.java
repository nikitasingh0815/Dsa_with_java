package qsession;
import java.util.*;

public class pblm1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    /*if(num==3){
        System.out.println("three");
    }else if(num==5){
        System.out.println("five");
    }else{
        System.out.println(num);
    }*/
    switch(num){
        case 3:{

            System.out.println("three");
            break;

        
        }


        case 5:{
            System.out.println("five");
            break;

        }
        default:{
            System.out.println(num);
        }

    }   
}
}




