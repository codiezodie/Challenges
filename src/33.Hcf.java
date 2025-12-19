import java.util.Scanner;

class Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = input.nextInt();
        System.out.println("Enter another number :");
        int num2 = input.nextInt();
        int result = hcf(num1, num2);
        System.out.println("The hcf is:"+result);

    }

    public static int hcf(int num1, int num2) {
        int x=(num1 < num2) ? num1:num2;
        while(true){
        if(num1 % x==0 && num2 % x==0){
            System.out.printf("The hcf of %d and %d is: %d",num1,num2,x);
            break;
        }
        x--;
        }
    return x;

    }
}
