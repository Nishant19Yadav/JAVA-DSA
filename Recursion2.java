import java.util.HashSet;

public class Recursion2 {
    public static void towerOfHanoi(int n,String src, String helper, String dest){ ///tower of hanoi
        if(n==1){
            System.out.println("Transfer Disk" + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk" + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    

    public static void printRev(String str, int idx){ ///print string in reverse
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idxx, char element){ ///find first and last index in string
        if(idxx == str.length()){
            //we are at the top of stack
            System.out.println("First Occurance at index: " + first);
            System.out.println("Last Occurance at index: " + last);
            return;
        }
        char currChar = str.charAt(idxx);
        if(currChar == element){
            if(first == -1){
                first = idxx;
            }else{
                last = idxx;
            }
        }
        //calling next level of stack
        findOccurance(str, idxx+1, element); 
    }

    public static boolean isSorted(int arr[], int index){ //check array is sorted
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            //array is sorted
           return isSorted(arr, index+1);

        }else{
            return false;
        }
    }

    public static void moveAllX(String strr, int indx, int count, String newString){ //Moving all x in the last of a string
        //base case
        if(indx == strr.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.err.println(newString);
            return;
        }
        char currChar = strr.charAt(indx);
        if(currChar == 'x'){
            count++;
            moveAllX(strr, indx+1, count, newString);
        }else{
            //newString = newString + currChar
            newString += currChar;
            moveAllX(strr, indx+1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String a, int idex, String newStringg){ ///remove duplicates from a string
        if(idex == a.length()){
            System.out.println(newStringg);
            return;
        }
        char currChar = a.charAt(idex);
        if(map[currChar - 'a']){
            removeDuplicates(a, idex+1, newStringg);
        }else{
            newStringg += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(a, idex+1, newStringg);
        }
    }

    public static void subSequences(String b, int z,String kk, HashSet<String> set){ ///print all the subsequence of a string         (IMPORTANT FOR PLACEMENT)
        if(z==b.length()){
            if(set.contains(kk)){
                return;
            }else{
                System.out.println(kk);
                set.add(kk);
                return;
            }
            // System.out.println(kk);
            // return;
        }
        char currChar = b.charAt(z);

        //to be
        subSequences(b, z+1, kk+currChar, set);

        //or not to be
        subSequences(b, z+1, kk, set);
    }


    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"}; ///Print keypad combination

    public static void printComb(String num, int iindex, String combination) {
        if(iindex == num.length()){
            System.out.println(combination);
            return;
        }
        char currChar = num.charAt(iindex);
        String mapping = keypad[currChar - '0'];

        for(int i=0;i<mapping.length();i++){
            printComb(num, iindex+1, combination+mapping.charAt(i));
        }
    }


    public static void main(String args[]){
        int n =3;
        towerOfHanoi(n, "S", "H", "D");
        System.out.println(""); ///tower of hanoi

        String str = "abaacdaefaah";
        printRev(str, str.length()-1); //reverse string
        System.out.println("");


        findOccurance(str, 0, 'a'); //find first and last index in string
        System.out.println("");

        int arr[]={1,3,3};
        System.out.println(isSorted(arr, 0)); //array is sorted
        System.out.println("");

        String strr = "axbcxxd";
        moveAllX(strr, 0, 0, "");
        System.out.println(""); //move all x in the last of string

        String a = "aabcdca";
        removeDuplicates(a, 0, "");
        System.out.println(""); //remove duplicates from a string

        String b = "xyz"; 
        //if b=aaa then
        //no duplicates subsequence will be printed

        HashSet<String> set = new HashSet<>();
        subSequences(b, 0, "", set);
        System.out.println(""); //print the subsequence of a string

        String num = "56";
        printComb(num, 0, ""); //Print keypad combination

    }
}
