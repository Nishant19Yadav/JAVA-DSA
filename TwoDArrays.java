import java.util.Scanner;

public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j] = sc.nextInt();

            }
        }
        int x = sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                //founding location 
                if(numbers[i][j]==x){
                    System.out.println("x is found at index (" + i + "," + j + ")");
                }
            }
        }
    }
    
}
