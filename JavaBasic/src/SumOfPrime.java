import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        int s=0,i=2,l=1,sum=0,dem=0;
        Scanner a = new Scanner(System.in);
        System.out.println("Nhập giới hạn số nguyên tố: ");
        int n = a.nextInt();
        while(l==1) {
            for (int j = 1; j <= i; j++) {
                if(i%j==0)
                    s=s+1;
            }
            if(s==2) {
                sum = sum + i;
                dem = dem + 1;
            }
            if(dem==(n))
                break;
            i++;
            s=0;
        }
        System.out.println("Tổng 10 số nguyên tố đầu tiên là: "+sum);
    }
}
