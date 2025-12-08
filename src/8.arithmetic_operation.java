import java.util.Scanner;
// Correcting previous commit message for arithmetic_operation program
class arithmetic_operation {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=input.nextInt();
        System.out.println("Enter second number:");
        int b=input.nextInt();
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        int divide=a/b;
        System.out.println("The Addition of\t" +a +"\tand\t" + b+"\t is:" +sum);
        System.out.println("The Subtraction of\t"+a +"\tand\t"+b+"\tis:"+diff);
        System.out.println("The Multiplication of\t"+a +"\tand\t"+b+"\tis:"+product);
        System.out.println("The division of\t"+a +"\tand\t"+b+"\tis:"+divide);
    }
}
