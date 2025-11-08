/*
     1st -> 9
     2st -> 10
     3st -> 11
     4st -> 12
 */
import java.util.Scanner;

class SequenceDemo2
{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        int iStd = 0;

        System.out.println("Enter Your Standard: ");
        iStd = sc.nextInt();

        if(iStd == 1){
            System.out.println("Exam at 9 AM");
        }
        else if(iStd == 2){
            System.out.println("Exam at 10 AM");
        }
        else if(iStd == 3){
            System.out.println("Exam at 11 AM");
        }
        else if(iStd == 4){
            System.out.println("Exam at 12 NOON");
        }
        else{
            System.out.println("Enter Currect Standard");
        }

    }
}