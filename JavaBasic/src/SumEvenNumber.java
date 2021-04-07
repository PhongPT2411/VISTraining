public class SumEvenNumber {
    public static void main(String[] args) {
        int i=0;
        int k=1;
        int sum =0;
        do {
            sum=sum+i;
            i=i+2;
            k++;
        }
        while(k<11);
        System.out.println("Tổng 12 số chẵn đầu tiên là:"+sum);
    }
}
