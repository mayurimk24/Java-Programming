import java.util.Scanner;

class SequenceDemo1
{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age: ");
        int iNo = 0;
        iNo = sc.nextInt();

        if(iNo >=18){
            System.out.println("You can Vote");
        }
        else{
            System.out.println("You can't Vote");
        }

    }
}