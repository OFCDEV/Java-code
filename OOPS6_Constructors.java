class MyMainEmployee{
    private int id1;
    private String name1;

    public String getName(){
        return name1;
    }
    public void setName(String n){
        name1 = n;
    }
    public int getId(){
        return id1;
    }
    public void setId(int i){
        id1 = i;
    }
    public MyMainEmployee(){ //Constructor
        id1 = 68;
        name1 = "Your name here!";

    }
}
public class OOPS6_Constructors {
    public static void main(String[] args) {
        MyMainEmployee Dev1 = new MyMainEmployee();
        
    }
}
