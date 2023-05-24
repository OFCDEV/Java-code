public class Array2 {
    public static void main(String[] args) {
        int[] marks = {99,98,95,94,89,77,79};
        System.out.println(marks.length);
        //Displaying the array using for loop
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);

        }
        //Method-2
        System.out.println("Another method");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
