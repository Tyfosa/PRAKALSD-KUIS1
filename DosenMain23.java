public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23("123456", "Dr. Andi", 2010, "S2", "Teknik Informatika");
        dosen1.tampilkanInfo();

        dosen1.ubahProdi("Sistem Informasi");
        dosen1.ubahPendidikan("S3");
        
        System.out.println("\nSetelah diubah:");
        dosen1.tampilkanInfo();
    }
}