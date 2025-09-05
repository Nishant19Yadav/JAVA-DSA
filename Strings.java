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

    }
}
