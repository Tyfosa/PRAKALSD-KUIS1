public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 mataKuliah = new MataKuliah23("TI01", "Pemrograman Dasar", 3, 5);
        Dosen23 dosen1 = new Dosen23("123456", "Dr. Andi", 2010, "S3", "Teknik Informatika");
        Dosen23 dosen2 = new Dosen23("654321", "Dr. Budi", 2012, "S2", "Sistem Informasi");

        mataKuliah.tambahDosen(dosen1);
        mataKuliah.tambahDosen(dosen2);

        mataKuliah.tampilkanInfo();

        mataKuliah.ubahNamaMK("Pemrograman Lanjutan");
        mataKuliah.ubahSKS(4);

        System.out.println("\nSetelah diubah:");
        mataKuliah.tampilkanInfo();
    }
}