package quanlysanpham;

import java.util.ArrayList;
import java.util.Scanner;

public class hangSanhSu extends hangHoa {
    String nhaSanXuat;
    String ngayNhapKho;
    int tonKho;
    int luuKho;
    Scanner s = new Scanner(System.in);

    public void nhapThongTin(ArrayList<hangHoa> obj) {
        super.nhapThongTin(obj);
        System.out.println("Nhập nhà sản xuất: ");
        nhaSanXuat = s.nextLine();
        System.out.println("Nhập ngày nhập kho: ");
        ngayNhapKho = s.nextLine();
        System.out.println("Nhập số lượng tồn kho: ");
        tonKho = s.nextInt();
        System.out.println("Thời gian lưu kho (ngày): ");
        luuKho = s.nextInt();
    }

    public void in() {
        super.in();
        System.out.print(" Nhà sản xuất: " + nhaSanXuat);
        System.out.println(" Ngày nhập kho: " + ngayNhapKho);
        System.out.println("Số lượng tồn kho(>=0): " + tonKho);
        System.out.println("Thời gian lưu kho: " + luuKho + " (ngày)");
    }

    @Override
    public void danhGia() {
        if (tonKho > 50 && luuKho > 10)
            System.out.println("Hàng bán chậm!");
        else
            System.out.println("Hàng ổn định!");
    }
}
