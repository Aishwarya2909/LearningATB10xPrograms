package input_taken_from_user;

public class Lab054_CL_Example2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
       int c = a>b?a:b;
        System.out.println("The value from user of 'a' is a = " +a);
        System.out.println("The value from user of 'b' is b = " +b);
        System.out.println("Ternary Operator for Cli to print max num is  " +c);
    }
}
