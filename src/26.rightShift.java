import java.util.Scanner;

 class rightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a = input.nextInt();

        int result = a >> 1;
        System.out.println("Result is:" + result);

    }

}
