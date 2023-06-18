package JavaOOP1;

public class SinhVien {
    private String hotenSV;
    private int tuoiSV;
    private String diachiSV;

    public SinhVien(String hotenSV, int tuoiSV, String diachiSV) {
        this.hotenSV = hotenSV;
        this.tuoiSV = tuoiSV;
        this.diachiSV = diachiSV;
    }

    public String getHotenSV() {
        return hotenSV;
    }

    public void setHotenSV(String hotenSV) {
        this.hotenSV = hotenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public String getDiachiSV() {
        return diachiSV;
    }

    public void setDiachiSV(String diachiSV) {
        this.diachiSV = diachiSV;
    }
}
