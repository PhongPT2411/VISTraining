package quanlysanpham;

        import java.util.ArrayList;
        import java.util.Scanner;

public class HangDienMay extends HangHoa {
    int thoiGianBH;
    int congSuat;
    int tonKho;
    Scanner s = new Scanner(System.in);

    public void nhapThongTin(ArrayList<HangHoa> obj) {
        super.nhapThongTin(obj);
        System.out.println("Nhập thời gian bảo hành(tháng): ");
        thoiGianBH = s.nextInt();
        System.out.println("Nhập công suất: ");
        congSuat = s.nextInt();
        System.out.println("Nhập số lượng tồn kho: ");
        tonKho = s.nextInt();
    }

    public void in() {
        super.in();
        System.out.print(" Thời gian bảo hành: " + thoiGianBH);
        System.out.println(" Công suất: " + congSuat);
        System.out.println("Số lương tồn kho(>=0): " + tonKho);
    }

    @Override
    public void danhGia() {
        if (tonKho < 3)
            System.out.println("Hàng bán được!");
        else
            System.out.println("Hàng không bán được!");
    }
}

