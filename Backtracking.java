public class Backtracking {

    public static void printPermutaion(String str, String perm, int idx){
        //base case
        if(str.length() == 0){
            System.out.println(perm);
            return ;
        }
        //kaam
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutaion(newstr, perm + currChar, idx+1);
            

        }
    }
    public static void main(String args[]){
        String str = "ABC";
        //calling function
        printPermutaion(str, "", 0);

    }
}
