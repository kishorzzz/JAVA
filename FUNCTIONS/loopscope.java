package FUNCTIONS;

public class loopscope {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){ // loop scope so we should not use this variable in the whole code outside the loop such type of variables are loopscope 
            System.out.println(i);
        }
    }
}
