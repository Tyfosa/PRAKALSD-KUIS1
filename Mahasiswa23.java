class Mahasiswa23 {
    private String nim;
    private String nama;
    private int tahunMasuk;
    private MataKuliah23[] mataKuliahDiambil;
    private int jumlahMataKuliah;

    // Konstruktor
    public Mahasiswa23(String nim, String nama, int tahunMasuk, int kapasitas) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah23[kapasitas];
        this.jumlahMataKuliah = 0;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Mata Kuliah Diambil:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
            System.out.println();
        }
    }

    // Metode untuk menambahkan mata kuliah yang diambil
    public void tambahMataKuliah(MataKuliah23 mataKuliah) {
        if (jumlahMataKuliah < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        } else {
            System.out.println("Kapasitas mata kuliah sudah penuh.");
        }
    }

    // Metode untuk menghitung total SKS yang diambil mahasiswa
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += mataKuliahDiambil[i].getSKS(); // Menggunakan metode getter
        }
        return totalSKS;
    }
}