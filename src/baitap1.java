import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        System.out.println("hcn");
        System.out.println("tg");
        System.out.println("tgc");
        choice=scanner.nextInt();
        switch (choice) {
            case 1:
            for (int i = 0; i < 3; i++) {
                System.out.println("");
                for (int j = 0; j < 8; j++) {
                    System.out.print("*");
                }
            }
            case 2:
                for(int i=1;i<8;i++){
                    System.out.println("");
                    for(int j=1;j<i;j++){
                        System.out.print("*");
                    }
                }
                for(int i=7;i>=1;i--){
                    System.out.println("");
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                }
        }
    }
}
