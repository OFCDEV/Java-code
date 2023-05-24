public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        for(int j=0; j<50; j++){
            if(j ==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("Java is great");
        }
    }
}
