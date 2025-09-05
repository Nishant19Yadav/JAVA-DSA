import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //for loop
        // for(int counter =0; counter<3; counter++){
        //     System.out.println(counter%2==0);
        // }

        //while
        // while (i<11) {
        //     System.out.println(i++);
            
        // }

        //do while
        // do{
        //     System.out.println(i++);
        // }while(i<11);


        //first sum of n natural no
        int a = sc.nextInt();
        // int sum =0;

        // for(int i =1;i<=a;i++){
        //     sum = sum+i;
        // }
        // System.out.println(sum);


        //table
        for(int i =1;i<11;i++){
            System.out.println(a*i);
        }
        
    }
}  