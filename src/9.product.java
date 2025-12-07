import java.util.Scanner;

class product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first floating number:");
        float a=input.nextFloat();
        System.out.println("Enter second floating number:");
        float b=input.nextFloat();
        float c=a*b;

        System.out.println("The product of floating number is:"+c);
    }
}
