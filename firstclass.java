import java.util.Scanner;
import java.util.*;

public class firstclass {
    public static void main(String[] args) {
        // int a = 35;
        // int b = 90;
        // float ans = (a*b)/(b-a);
        //System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }else if(a>b){
            System.out.println("a is greater");
            
        }else{
            System.out.println("a is smaller");
        }
    }
}
