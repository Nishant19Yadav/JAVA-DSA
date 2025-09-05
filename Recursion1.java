public class Recursion1 {
    public static void printSum(int i,int a, int sum){ //print the sum of n natural numbers;

        //Base Case
        if(a == 6){
            return;
        }
        if( i == a){
            sum += i;
            System.out.println(sum);
            return ;
        }
        sum += i;
        printSum(i+1, a, sum);
        // System.out.println(sum);
    }

    public static int calculateFactorial(int n){ //print the factorial of number n;

        if( n==1 || n==0){
            return 1;
        }
        int fact_num1 = calculateFactorial(n-1);
        int fact_n = n * fact_num1;
        return fact_n;
        
        
    }

    public static void printfibonacci(int z, int y, int x){ //print fibonacci sequence till n numbers
        if(x==0){
            return;
        }
        int c = z+y;
        System.out.println(c);
        printfibonacci(y, c, x-1);

    }

    public static int calcPower(int w, int j){ // print the height of stack(n)
        if(j == 0){ //base case 1
            return 1;
        }
        if(w == 0){ //base case 2
            return 0;
        }
        // int xPownm1 = calcPower(w, j-1);
        // int xPownm = w * xPownm1;
        // return xPownm;

        //for stack heigth = logn
        if(j % 2 == 0){ // j is even
            return calcPower(w, j/2) * calcPower(w, j/2);
        }else{ //j is odd
            return calcPower(w, j/2) * calcPower(w, j/2) * w;
        }


    }
    
    public static void main(String args[]){

        printSum(1, 5, 0); ///sum on n natural numbers
        System.out.println("Break;");

        int n =5;
        int ans = calculateFactorial(n);
        System.out.println(ans); ///factorial of n numbers
        System.out.println("Break;");

        int z = 0;
        int y =1;
        System.out.println(z);
        System.out.println(y);
        int x = 7;
        printfibonacci(z, y, x-2); ///printing fibonacci series
        System.out.println("Break;");

        int w =2, j =5;
        int answer = calcPower(w, j);
        System.out.println(answer); ///printing the stack's height

    }
}
