import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        //int marks[] = new int[3];
        //int[] marks = {97,94,45};
        // int[] marks = new int[3];
        // marks[0]=97;
        // marks[1]=94;
        // marks[2]=45;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //linear search
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // //taking the values of array from user
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        int x = sc.nextInt();
    

        // //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("X found at index " + i);

            }
        }

    }
}
