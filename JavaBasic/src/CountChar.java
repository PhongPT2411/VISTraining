import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        int count = 0;
        Scanner s  = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần soát: ");
        String chuoi = s.nextLine();
        System.out.println(chuoi);
        System.out.println("Nhập vào kí tự cần đếm:");
        char char1 = s.next().charAt(0);
        for(int i=0;i<chuoi.length();i++){
            if(char1==chuoi.charAt(i))
                count++;
        }
        System.out.println("Số lần xuất hiện là: "+count);
    }
}
