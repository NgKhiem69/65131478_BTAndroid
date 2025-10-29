package thigk2.NguyenGiaKhiem.a65131478;

public class HoatDong {
    private String tieude, thoigian;
    private int anh;

    public HoatDong(String tieude, String thoigian, int anh) {
        this.tieude = tieude;
        this.thoigian = thoigian;
        this.anh = anh;
    }

    public String getTieude() { return tieude; }
    public String getThoigian() { return thoigian; }
    public int getAnh() { return anh; }
}
