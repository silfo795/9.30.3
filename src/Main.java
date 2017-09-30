import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.printf("%d\n",a+b+c);
        System.out.printf("%d\n",(a+b+c)/3);
    }
}
