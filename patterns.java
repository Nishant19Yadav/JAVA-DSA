public class patterns {
    public static void main(String args[]){
        int n = 4;
        int m = 5;

       // outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j =0;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("NEW PATTERN");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("NEW PATTERN");
        for(int i =1 ; i<=n;i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("NEW PATTERN");
        for(int i =n ; i>=1;i--){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("NEW PATTERN");
        //outer loop
        for(int i =1 ; i<=n; i++){
            //inner loop -> space print
            for(int j = 1; j<=n-i ;j++){
                System.out.print(" ");
            }
            //inner loop -> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 


        System.out.println("NEW PATTERN");
        for(int i=0;i<=m;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("NEW PATTERN");
        for(int i=0;i<=m;i++){
            for(int j = 1;j<=m-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        

        System.out.println("NEW PATTERN");
        int number=1;
        for(int i=0;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


        System.out.println("NEW PATTERN");
        int z = 5;
        for(int i=1;i<=z;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
