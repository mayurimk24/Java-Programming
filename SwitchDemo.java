import java.util.Scanner;

class SwitchDemo
{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        int iStd = 0;

        System.out.println("Enter Your Standard: ");
        iStd = sc.nextInt();

        switch(iStd){
            case 1:
                System.out.println("Exem at 9 AM");
                break;
            case 2:
                System.out.println("Exem at 10 AM");
                break;
            case 3:
                System.out.println("Exem at 11 AM");
                break;
            case 4:
                System.out.println("Exem at 12 NOON");
                
            default:
                System.out.println("Invalid Standard");
        }

    }
}