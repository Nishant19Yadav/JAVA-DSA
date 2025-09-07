public class Recursion3 {
    public static void printPermutaion(String str, String permutation){ ///print permutation of a string
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutaion(newStr, permutation+currChar);
        }
    }

    public static int countPaths(int i, int j , int n ,int m){ //CountPathMaze from (0,0) to (n,m)              (BACK TRACKING)
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //move to down
        int downPaths = countPaths(i+1, j, n, m);

        //move to right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }


    public static int placeTiles(int n, int m) { //placing tiles
       if(n < m) {
           return 1;
       } else if(n == m) {
           return 2;
       }


       return placeTiles(n-1, m) + placeTiles(n-m, m); 
   }

    public static int pairFriends(int n) { ///calling guests
      if(n <= 1) {
          return 1;
      }


       return pairFriends(n-1) + (n-1) * pairFriends(n-2);
   }


    public static void main(String args[]){
        String str = "abc";
        printPermutaion(str, ""); //print permutation of a string
        System.out.println("");

        int n =4;
        int m =2;
        int totalpath = countPaths(0, 0, n, m);
        System.out.println(totalpath);//CountPathMaze from (0,0) to (n,m)
        System.out.println("");

        System.out.println(placeTiles(n, m)); //placing tiles
        System.out.println("");

        System.out.println(pairFriends(n)); //calling guest
        System.out.println("");

        
    }
}
