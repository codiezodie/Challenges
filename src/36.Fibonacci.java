import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        //fib(num);
        System.out.println("The fibonacci series is:");
        fib(num);
    }
    public static void fib(int num){
        int firstNo=0,secondNo=1;
        int Third;
        if(num<0){
            return;
        }
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        while( firstNo + secondNo<=num){
            Third=firstNo+secondNo;
            System.out.print(Third +" ");
            firstNo=secondNo;
            secondNo=Third;

        }

    }
}
