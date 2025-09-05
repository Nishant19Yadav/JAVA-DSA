import java.util.Scanner;

public class Bits {
    public static void main(String args[]){
        int n =5; //0101
        int pos = 1;
        //int bitMask = 1<<pos;




        
        //get bit
        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }




        //set bit
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);




        //cleat bit
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);





        //update bit
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        //update bit to 1 else to 0

        int bitMask = 1<<pos;
        if(opr == 1){
            //set
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }
        


    }
}
