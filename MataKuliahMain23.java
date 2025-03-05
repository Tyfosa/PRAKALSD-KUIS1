import java.util.Scanner;

public class MataKuliahMain23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode MK: ");
        String kodeMK = scanner.nextLine();
        System.out.print("Masukkan Nama MK: ");
        String namaMK = scanner.nextLine();
        System.out.print("Masukkan SKS: ");
        int sks = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        MataKuliah23 mataKuliah = new MataKuliah23(kodeMK, namaMK, sks);
        mataKuliah.tampilkanInfo();

        System.out.print("Ubah Nama MK: ");
        String namaMKBaru = scanner.nextLine();
        mataKuliah.ubahNamaMK(namaMKBaru);
        mataKuliah.tampilkanInfo();

        System.out.print("Ubah SKS: ");
        int sksBaru = scanner.nextInt();
        mataKuliah.ubahSKS(sksBaru);
        mataKuliah.tampilkanInfo();
    }
}