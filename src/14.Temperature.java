import java.util.Scanner;

 class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Temperature in fahrenheit:");
        float f=input.nextFloat();

        float celsius=(f-32)*5/9;
        System.out.println("Your temperature ein celsius:" + celsius +"C");
    }
}
