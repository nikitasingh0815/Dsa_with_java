import java.util.Scanner;

public class num {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num==3){
        System.out.println("three");
    }else if(num==5){
        System.out.println("five");
    }else{
        System.out.println(num);
    }
}
}
