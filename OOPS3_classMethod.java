class Employee2{
    int id;
    String name;
    int salary;
    public void employeeDetails(){
        System.out.println("Employee id is " +id);
        System.out.println("Employee name is " +name);
    }
    public int getSalary(){ //Creating a method
        return salary;
    }
}
public class OOPS3_classMethod {
    public static void main(String[] args) {
        System.out.println("This is our first custm class with methods");
        Employee2 dev = new Employee2();//Creating
        Employee2 john = new Employee2();

        //Setting Attributes
        dev.id=69;
        dev.name="JODdev";
        dev.salary=75;
        john.id=21;
        john.name="KamChor";
        john.salary=60;
        int salary=john.getSalary();

        dev.employeeDetails();
        john.employeeDetails();
        System.out.println(salary);

    }
}
