public class MethodsQuestion {
    //Multiplication
    static void multiplication(int n){
        for(int i=0; i<=10; i++){
            System.out.format("%d X %d =%d\n", n,i,n*i);
        }
    }
    //Pritn stars
    static void parttern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Recursive function to sum n natural numbers
    static int sumReac(int n){
        if(n==1){
            return 1;
        }
        else{
           return n + sumReac(n-1);
        }
    }
    //Patern printing Star wali bakchodi
   /* static void pattern2(int X){
        for(int q=0; q>X; q--){
            for(int p=0; p>q-1; p--){
                System.out.print("*");
            }
             System.out.println();
        }
       
    }*/
    public static void main(String[] args) {
        //Q1
        multiplication(8);
        //Q2
        parttern1(4);
        //Q3
        int c = sumReac(3);
        System.out.println(c);
        //Q4
       // pattern2(4);
    }
}
