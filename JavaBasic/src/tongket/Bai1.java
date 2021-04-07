package tongket;

public class Bai1 {
    public static void main(String[] args) {
        System.out.print("*\n");
        for(int i=1;i<8;i++) {
            System.out.print("*");
                for (int j =0;j<i-1;j++)
                    System.out.print(" ");
            System.out.print("*\n");
        }
        System.out.println("*********");
    }
}
