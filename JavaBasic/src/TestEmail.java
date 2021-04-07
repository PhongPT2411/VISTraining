import java.util.Scanner;
public class TestEmail {
    public static void main(String[] args) {
        boolean test;
        Scanner sc = new Scanner(System.in);
        do {
            String emailPattern = "\\w+@\\w+[.]\\w+([.]\\w+)?";
            System.out.print("Nhập email theo mẫu sau (email@address.com): ");
            String input = sc.next();
            sc.nextLine();
            test = input.matches(emailPattern);
            if (!test) System.out.println("Không đúng định dạng!");
        } while (!test);
        System.out.println("Đúng định dạng!");
    }
}