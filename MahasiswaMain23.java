import java.util.Scanner;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        System.out.print("Masukkan Kapasitas Mata Kuliah: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        Mahasiswa23 mahasiswa = new Mahasiswa23(nim, nama, tahunMasuk, kapasitas);

        // Menambahkan mata kuliah
        char tambahMataKuliah;
        do {
            System.out.print("Masukkan Kode MK: ");
            String kodeMK = scanner.nextLine();
            System.out.print("Masukkan Nama MK: ");
            String namaMK = scanner.nextLine();
            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            MataKuliah23 mataKuliah = new MataKuliah23(kodeMK, namaMK, sks);
            mahasiswa.tambahMataKuliah(mataKuliah);

            System.out.print("Apakah Anda ingin menambahkan mata kuliah lagi? (y/n): ");
            tambahMataKuliah = scanner.nextLine().charAt(0);
        } while (tambahMataKuliah == 'y' || tambahMataKuliah == 'Y');

        // Menampilkan informasi mahasiswa
        mahasiswa.tampilkanInfo();

        // Menghitung dan menampilkan total SKS
        int totalSKS = mahasiswa.hitungTotalSKS();
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
}