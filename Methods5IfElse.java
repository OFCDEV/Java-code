//Check age
public class Methods5IfElse {
    static void ageCheck(int age ){
        if(age < 18){
            System.out.println("Youre not eligible");
        }
        else{
            System.out.println("Youre eligble");
        }
    }
    public static void main(String[] args) {
        ageCheck(69);
    }
}
