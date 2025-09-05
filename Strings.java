import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        //String declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My Name Is Tony";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Your name is : " + name);

        //concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "tony";
        String name2 = "tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Same");
        }else{
            System.err.println("Different");
        }

        if(new String("Tony") == new String("Tony")){
            System.out.println("Same");
        }else{
            System.err.println("Different");
        }

        //subString(begining index, ending index)
        String www = "My name is Ironman";
        String zzz = www.substring(11);
        System.out.println(zzz);

        System.out.println("String Builder is Starting from here");

        //String Builder from here
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char index at 1
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'L');
        System.out.println(sb);

        sb.insert(2, 'N');
        System.out.println(sb);

        //delete the extra n
        sb.delete(2, 4);
        System.out.println(sb);

        //addding in substring
        sb.append(" ");
        sb.append("S");
        sb.append("T");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb);
        System.out.println(sb.length());

        //reverse String
        sb.reverse();
        System.out.println(sb);

        //reverse String
        StringBuilder sbb = new StringBuilder("Yadav");
        for(int i=0;i<sbb.length()/2;i++){
            int front =i;
            int back = sbb.length() -1 -i; // 5-1-0 =4

            char frontChar = sbb.charAt(front);
            char backChar = sbb.charAt(back);

            sbb.setCharAt(front, backChar);
            sbb.setCharAt(back, frontChar);
            

        }
        //sbb.reverse();
        System.out.println(sbb);
        


    }
}
