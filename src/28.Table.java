import java.util.Scanner;

 class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for which you want a table:");
        int num = input.nextInt();
        printTable(num);

    }
        public static void printTable(int num){
            for (int i = 1; i <= 10; i++) {
                int product = num * i;
                System.out.println(num + "x" + i + "=" + product);
            }
        }
}
