package ex_operators;

public class Lab052_Inc_Dec_Example {

    public static void main(String[] args) {
        int a= 20;
        System.out.println("Print the value of 'a' is " +a);
        int b = --a+ a++ + a--;
        System.out.println("Print the Expression value of 'a' is " +b);
        System.out.println("After the expression 'a' value is " +a);

    }
}
