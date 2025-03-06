class MataKuliah23 {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private Dosen23[] dosenPengampu;
    private int jumlahDosen;

    public MataKuliah23(String kodeMK, String namaMK, int sks, int kapasitasDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen23[kapasitasDosen];
        this.jumlahDosen = 0;
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu: ");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
            System.out.println();
        }
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

    public void tambahDosen(Dosen23 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Tidak dapat menambahkan dosen, kapasitas penuh.");
        }
    }
}