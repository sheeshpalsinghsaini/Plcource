package test;

public class Test {
    public static void main(String[] args) {
        
        boolean flag = true;

        for(int i=1;i<6;i++){
            if(flag){
                i--;
            }
            flag = false;
            System.out.println(i);
        }
    }
}
