package JavaOOP.nganlam.com;

import java.util.ArrayList;

public class ThongTinSV {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien("Ngan", 20, "HCM");
        SinhVien sinhVien2 = new SinhVien("Trang", 22,"Ha Noi");
        SinhVien sinhVien3 = new SinhVien("Nhi", 22,"Da Nang");

        ArrayList<SinhVien> arrayList = new ArrayList<>();
        arrayList.add(sinhVien1);
        arrayList.add(sinhVien2);
        arrayList.add(sinhVien3);

        for (SinhVien sinhVien : arrayList){
            System.out.println(sinhVien.getHotenSV() + ", " + sinhVien.getTuoiSV() + ", " + sinhVien.getDiachiSV());
        }
    }
}
