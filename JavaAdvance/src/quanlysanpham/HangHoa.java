package quanlysanpham;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoa {
    String maHang;
    String tenHang;
    int soLuongTon;
    int donGia;
    static Scanner s = new Scanner(System.in);


    public void nhapThongTin(ArrayList<HangHoa> obj) {
        int h = 1;
        int k = 1;
        while (h == 1) {
            System.out.println("Nhập mã hàng:");
            if (k == 1)
                s.nextLine();
            maHang = s.nextLine();
            if (obj.size() == 0)
                break;
            for (int i = 0; i < obj.size(); i++) {
                if (obj.get(i).maHang.equals(maHang)) {
                    System.out.println("Trùng, nhập lại mã hàng:");
                    k++;
                    break;
                }
                if (i == obj.size() - 1)
                    h = 0;
            }

        }
        System.out.println("Nhập tên hàng: ");
        tenHang = s.nextLine();
        System.out.println("Nhập số lượng tồn: ");
        soLuongTon = s.nextInt();
        System.out.println("Nhập đơn giá(>0):");
        donGia = s.nextInt();
    }

    ;


    public void danhGia() {
    }

    ;

    public void in() {
        System.out.print("Mã hàng: " + maHang);
        System.out.print(" Tên hàng: " + tenHang);
        System.out.print(" Số lượng tồn: " + soLuongTon);
        System.out.println(" Đơn giá: " + donGia);
    }

    ;


    public static void main(String[] args) {
        ArrayList<HangHoa> danhSachHangHoa = new ArrayList<HangHoa>();
        int k = 1;
        while (k == 1) {
            System.out.println("Menu:");
            System.out.println("1, Nhập danh sách ");
            System.out.println("2, In danh sách ");
            System.out.println("3, Đánh giá các mặt hàng");
            System.out.println("4, Thoát");
            System.out.print("Nhập tùy chọn của bạn:");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng sản phẩm cần nhập: ");
                    int a2 = s.nextInt();
                    for (int i = 0; i < a2; i++) {
                        System.out.println("Chọn loại sản phẩm: ");
                        System.out.println("1: Hàng thực phẩm");
                        System.out.println("2: Hàng sành sứ");
                        System.out.println("3: Hàng điện máy");
                        System.out.println("4: Thoát");
                        int a1 = s.nextInt();
                        switch (a1) {
                            case 1:
                                HangHoa tt = new HangTP();
                                tt.nhapThongTin(danhSachHangHoa);
                                danhSachHangHoa.add(tt);
                                break;
                            case 2:
                                HangHoa tt1 = new HangSanhSu();
                                tt1.nhapThongTin(danhSachHangHoa);
                                danhSachHangHoa.add(tt1);
                                break;
                            case 3:
                                HangHoa tt2 = new HangDienMay();
                                tt2.nhapThongTin(danhSachHangHoa);
                                danhSachHangHoa.add(tt2);
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 2:
                    if (danhSachHangHoa.size() == 0){
                        System.out.println("Chưa có hàng hóa được thêm vào! Vui lòng thêm hàng hóa để hiển thị.");
                        break;}
                    for (int i = 0; i < danhSachHangHoa.size(); i++) {
                        System.out.println("Sản phẩm " + (i + 1) + ":");
                        danhSachHangHoa.get(i).in();
                    }
                    break;

                case 3:
                    System.out.println("Tình trạng các loại hàng hóa: ");
                    for (int i = 0; i < danhSachHangHoa.size(); i++) {
                        System.out.println("Sản phẩm " + i);
                        danhSachHangHoa.get(i).danhGia();
                    }
                    break;
                case 4:
                    k = 2;
                    System.out.println("Chương trình kết thúc!");
                    break;
            }
        }

    }
}
