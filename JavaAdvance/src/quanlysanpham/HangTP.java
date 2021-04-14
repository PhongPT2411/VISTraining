package quanlysanpham;

import java.util.ArrayList;
import java.util.Scanner;

public class HangTP extends HangHoa {
    String ngaySX;
    String ngayHH;
    String nCC;
    int tonKho;
    boolean hetHan;
    Scanner s = new Scanner(System.in);

    public void nhapThongTin(ArrayList<HangHoa> obj) {
        super.nhapThongTin(obj);
        System.out.println("Nhập ngày tháng năm sản xuất: ");
        ngaySX = s.nextLine();
        System.out.println("Nhập ngày hết hạn: ");
        ngayHH = s.nextLine();
        System.out.println("Nhập nhà cung cấp: ");
        nCC = s.nextLine();
        System.out.println("Nhập số lượng tồn kho: ");
        tonKho = s.nextInt();
        System.out.println("Nếu hết hạn nhập flase, còn hạn nhập true: ");
        hetHan = s.nextBoolean();
    }

    public void in() {
        super.in();
        System.out.print("Ngày tháng năm sản xuất: " + ngaySX);
        System.out.print(" Ngày hết hạn: " + ngayHH);
        System.out.println(" Nhà cung cấp: " + nCC);
        System.out.println("Số lượng tồn kho(>=0): " + tonKho);
        if (!hetHan)
            System.out.println("Sản phẩm đã hết hạn!");
        else
            System.out.println("Sản phẩm còn hạn.");
    }

    public void danhGia() {
        if (tonKho > 0 || !hetHan)
            System.out.println("Sản phẩm này khó bán!");
        else
            System.out.println("Hàng ổn định!");
    }
}
