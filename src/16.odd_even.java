import java.util.Scanner;

 class odd_even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter you number:");
        int a=input.nextInt();

        if(a%2==0){
            System.out.println("The entered number is even .");
        }
        else{
            System.out.println("The entered number is odd");
        }
    }
}
