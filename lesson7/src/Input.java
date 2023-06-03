import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       System.out.println("введите что-нибудь число");
       int x = s.nextInt();
       System.out.println("вы ввели "+x);
    }
}
