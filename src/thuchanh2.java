import java.util.Scanner;
public class thuchanh2 {
    public static void main(String[] args) {
       double money=1.0;
       int month=1;
       double interesRate=1.0;
       Scanner input =new Scanner(System.in);
        System.out.println("enter investment amount:");
        money=input.nextDouble();
        System.out.println("enter number of months");
        month =input.nextInt();
        System.out.println("enter annual interest rate in percentage");
        interesRate=input.nextDouble();
        double totalInterest=0;
        for(int i=0;i<month;i++){
            totalInterest+=money*(interesRate/100)/12*month;
        }
        System.out.println("total of interet:"+totalInterest);
    }
}
