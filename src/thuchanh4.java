import java.util.Scanner;
public class thuchanh4 {
    public static void main(String[] args) {
        int choice=-1;
        while(choice!=0) {
            Scanner input = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1.ve tam giac");
            System.out.println("2.ve hinh vuong");
            System.out.println("3.ve hinh chu nhat");
            System.out.println("0.exit");
            System.out.println("enter your choice:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("ve tam giac");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("ve vuong");
                    System.out.println("***");
                    System.out.println("***");

                    break;
                case 3:
                    System.out.println("ve chu nhat");
                    System.out.println("***");
                    System.out.println("***");
                    System.out.println("***");
                    break;
                case 0:
                    System.out.println(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
