import java.util.Scanner;

class MataKuliah23 {
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah23(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSKS(int SKS) {
        if (SKS < 2) {
            System.out.println("Jumlah SKS tidak boleh kurang dari 2.");
        } else {
            this.sks = SKS;
        }
    }

    // Getter untuk SKS
    public int getSKS() {
        return sks;
    }
}