package ex_01_examples;

public class typecasting {
    public static void main(String[] args) {
        int a = 10;
        float b = 12.5f;
        float c = 25.8F;
        float d  = a+b+c;
        System.out.println(d);
        int e =(int)(a+b+c);
        System.out.println(e);
    }
}
