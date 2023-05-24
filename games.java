public class games {
    public static void main(String[] args) {
        
        class User {
            int score;
            public boolean haswin(){
                if(score>=100){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        User dev = new User();
        dev.score =101;
        System.out.println(dev.haswin());
    }
}
