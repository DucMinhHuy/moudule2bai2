import java.util.Scanner;
public class thuchanh3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter a");
        a=scanner.nextInt();
        System.out.println("enter b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("k co uoc lon nhat");
            for(;a!=b;){
                if(a>b){
                    a=a-b;

                }else {
                    b=b-a;
                }

            }

        }
        System.out.println("uoc chung la:"+a);
    }
}
