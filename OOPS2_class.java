class Employee{
    int id;
    String name;
}
public class OOPS2_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee jod= new Employee(); //Initiating a new Employee Object

        //Setting Attributes
        jod.id=69;
        jod.name="hehe";

        //Pritnting the attributes
        System.out.println(jod.id);
        System.out.println(jod.name);


    }
}
