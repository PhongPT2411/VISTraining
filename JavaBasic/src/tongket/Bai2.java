package tongket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai2 extends ThongTinDiDong {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Phong\\Desktop\\VIS\\tt.txt");
        FileWriter fw = new FileWriter("C:\\Users\\Phong\\Desktop\\VIS\\result.txt");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần tìm kiếm theo format(.*88.*89.*), trong đó 88 và 89 là 2 số có trong số điện thoại cần tìm:");
        String chuoiRegex =  scanner1.nextLine();
        Scanner scanner = new Scanner(fileInputStream);
        ThongTinDiDong thongTin[] = new ThongTinDiDong[10];
        int i = 0;
        String readTxt;
        try {
            while (scanner.hasNextLine()) {
                readTxt = scanner.nextLine();
                String trungGian[]= readTxt.split(",");
                    thongTin[i] = new ThongTinDiDong();
                    thongTin[i].SDT = trungGian[0];
                    thongTin[i].NhaMang = trungGian[1];
                    thongTin[i].GiaTien = trungGian[2];
                if (thongTin[i].SDT.matches(chuoiRegex.trim())) {
                    try {
                        fw.write("Số điện thoại: " + thongTin[i].SDT + " Nhà mạng: " + thongTin[i].NhaMang + " Giá tiền " + thongTin[i].GiaTien + "\n");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                i++;
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
                fw.close();
                System.out.println("Chương trình kết thúc!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//        0903657890,Mobifone,500000
//        0988898899,Viettel,10000000
//        0918876892,Vinaphone,1000000
