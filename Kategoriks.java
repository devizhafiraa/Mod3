import java.util.ArrayList;

public class Kategoriks {
    private String namaKategori;
    private ArrayList<BukunyaDevi> daftarBuku;

    public Kategoriks(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(BukunyaDevi buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("Kategori: " + namaKategori);
        for (BukunyaDevi buku : daftarBuku) {
            buku.tampilkanBuku();
        }
    }
}
