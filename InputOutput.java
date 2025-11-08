import java.util.Scanner;

class InputOutput
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, ANS = 0;

        System.out.println("Enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        no2 = sobj.nextInt();

        ANS = no1 + no2;

        System.out.println("Addition is : "+ANS);


    }
}