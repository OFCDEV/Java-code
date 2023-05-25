import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
            System.out.println("You are going to become an adult.");
            break;
            case 23:
            System.out.println("You are going to join a job.");
            break;
            case 31:
            System.out.println("You are going to marry love of your life.");
            break;
            default:
            System.out.println("Enjoy your life.");
            
        }
    }
}
