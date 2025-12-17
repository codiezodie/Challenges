import java.util.Scanner;

 class leftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a = input.nextInt();

        int result = a << 2;
        System.out.println("Result is:" + result);

    }
}
