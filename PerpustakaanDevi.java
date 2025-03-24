public class PerpustakaanDevi {
    public static void main(String[] args) {
        BukunyaDevi[] daftarBuku = new BukunyaDevi[35];

        // Teknologi
        daftarBuku[0] = new BukunyaDevi("Menyelami Teknologi", "Budi Raharjo", 2020, "Gramedia", "Teknologi", "Sinopsis tentang menyelami teknologi.Jangan beli buku bajakan kasian penulis .");
        daftarBuku[1] = new BukunyaDevi("Revolusi Digital", "Soe Hok Gie", 2019, "Mizan", "Teknologi", "Sinopsis tentang revolusi digital.Jangan beli buku bajakan kasian penulis . TAMBAH APA YA KAK KOK BINGUNG");
        daftarBuku[2] = new BukunyaDevi("Inovasi Tak Terbatas", "Arief Budiman", 2021, "Elex Media", "Teknologi", "Sinopsis tentang inovasi.Jangan beli buku bajakan kasian penulis .INOVASI UPDATE LAH YA KAYA UPINIPIN ");
        daftarBuku[3] = new BukunyaDevi("Teknologi Masa Depan", "Rani Suryani", 2022, "Indie Book", "Teknologi", "Sinopsis teknologi masa depanJangan beli buku bajakan kasian penulis .UPINIPIN JADI PUTIH");
        daftarBuku[4] = new BukunyaDevi("Transformasi Digital", "Tomi Gunawan", 2020, "Alpukat", "Teknologi", "Sinopsis transformasi digital. Jangan beli buku bajakan kasian penulis .UPIN IPIN DIENDORSE SCARLETTE?");

        // Filsafat
        daftarBuku[5] = new BukunyaDevi("Filsafat Hidup", "Sukarno", 2015, "Alfabet", "Filsafat", "Sinopsis filsafat hidup.Jangan beli buku bajakan kasian penulis . BELI YAN KANG YUK");
        daftarBuku[6] = new BukunyaDevi("Pemikiran Filosofis", "Joko Widodo", 2018, "Buku Kita", "Filsafat", "Sinopsis pemikiran filosofis.Jangan beli buku bajakan kasian penulis .HAHHHHHH HAHHH");
        daftarBuku[7] = new BukunyaDevi("Merenung di Dunia Filsafat", "Pramudya Ananta Toer", 2017, "Pustaka Populer", "Filsafat", "Sinopsis merenung.Jangan beli buku bajakan kasian penulis . INI HARUS");
        daftarBuku[8] = new BukunyaDevi("Filsafat dan Keberagaman", "Guntur Tamsil", 2016, "Asimetris", "Filsafat", "Sinopsis keberagamanJangan beli buku bajakan kasian penulis  beli lah beli .");
        daftarBuku[9] = new BukunyaDevi("Menjadi Filsuf", "Kartini", 2013, "Agung", "Filsafat", "Sinopsis menjadi filsuf.Jangan beli buku bajakan kasian penulis .semuanya beli awas dosa lo bajakan");

        // Sejarah
        daftarBuku[10] = new BukunyaDevi("Sejarah Indonesia", "Eddy Saparudin", 2016, "Erlangga", "Sejarah", "Sinopsis sejarah Indonesia.Jangan beli buku bajakan kasian penulis . Ini jas merah kah");
        daftarBuku[11] = new BukunyaDevi("Perang Dunia Kedua", "Rudi Wijaya", 2015, "Yayasan Pustaka", "Sejarah", "Sinopsis perang dunia.Jangan beli buku bajakan kasian penulis .jas merah jalangan meninggalkan sejarah");
        daftarBuku[12] = new BukunyaDevi("Sejarah Peradaban Dunia", "Faisal Abdul", 2017, "Gramedia", "Sejarah", "Sinopsis peradaban dunia.Jangan beli buku bajakan kasian penulis . iya parah nbanget semua aja lu bajak");
        daftarBuku[13] = new BukunyaDevi("Sejarah Kebangkitan Nasional", "Yusuf Effendi", 2018, "Serba Pustaka", "Sejarah", "Sinopsis kebangkitan nasional.Jangan beli buku bajakan kasian penulis .becanda bajak");
        daftarBuku[14] = new BukunyaDevi("Jatuh Bangun Kerajaan Majapahit", "Perry Utama", 2020, "Sejarah Indonesia", "Sejarah", "Sinopsis kerajaan Majapahit.Jangan beli buku bajakan kasian penulis .Tuh jangan ga update");

        // Agama
        daftarBuku[15] = new BukunyaDevi("Al-Qur'an", "K.H. Hasyim Asyari", 2010, "Mizan", "Agama", "Sinopsis Al-Qur'an.Jangan beli buku bajakan kasian penulis . Kurang ternyata namabah apa ya");
        daftarBuku[16] = new BukunyaDevi("Kisah Nabi Muhammad SAW", "Amien Rais", 2015, "Buku Muslim", "Agama", "Sinopsis kisah nabi.Jangan beli buku bajakan kasian penulis . yayayay ya JANGAN ILMU DUNYAAA MULUK");
        daftarBuku[17] = new BukunyaDevi("Filosofi Hidup Islam", "Nurcholish Madjid", 2012, "Majelis Ulama Indonesia", "Agama", "Sinopsis filosofi Islam.Jangan beli buku bajakan kasian penulis . BELI BELI");
        daftarBuku[18] = new BukunyaDevi("Rukun Iman dan Rukun Islam", "Ali Bin Abi Thalib", 2014, "Islamic Press", "Agama", "Sinopsis rukun iman dan Islam.Jangan beli buku bajakan kasian penulis .BELAJAR DONG SEMUANYA INI PESEN BUAT SEMUANYA");
        daftarBuku[19] = new BukunyaDevi("Hadis dan Hikmah", "Syekh Ali Jaber", 2016, "Islamic Book", "Agama", "Sinopsis hadis dan hikmah.Jangan beli buku bajakan kasian penulis .BELAJARR AGAMA IS A MUST");

        // Psikologi
        daftarBuku[20] = new BukunyaDevi("Psikologi Manusia", "Psikologina", 2021, "Psikologi Press", "Psikologi", "Sinopsis psikologi manusia. Jangan beli buku bajakan kasian penulis . TUH BELAJAR GUYSS BELI LAH BUKU INI ");
        daftarBuku[21] = new BukunyaDevi("Mengenali Karakter", "Johan Sumarno", 2022, "Psychology", "Psikologi", "Sinopsis mengenali karakter. Jangan beli buku bajakan kasian penulis . KARAKTER APA KAAK AI?");
        daftarBuku[22] = new BukunyaDevi("Psikologi Kepribadian", "Rani Kristiani", 2019, "Erlangga", "Psikologi", "Sinopsis kepribadian.Jangan beli buku bajakan kasian penulis . Hmm ini bagus beli dong");
        daftarBuku[23] = new BukunyaDevi("Psikologi Remaja", "Dr. Surya Saputra", 2020, "Indie Book", "Psikologi", "Sinopsis psikologi remaja.Jangan beli buku bajakan kasian penulis . Bagus nih menarik");
        daftarBuku[24] = new BukunyaDevi("Kecerdasan Emosional", "Daniel Goleman", 2018, "Mizan", "Psikologi", "Sinopsis kecerdasan emosional.Yang lagi emosi sabar puasa brow. Gitu kaatanya");

        // Politik
        daftarBuku[25] = new BukunyaDevi("Politik Indonesia", "Puan Maharani", 2016, "Buku Politik", "Politik", "Sinopsis politik Indonesia.Jangan beli buku bajakan kasian penulis . TOLAK RUU TNI. tolak aksikan suara ");
        daftarBuku[26] = new BukunyaDevi("Reformasi Politik", "Susilo Bambang Yudhoyono", 2015, "Indie Press", "Politik", "Sinopsis reformasi politik.TOLAK RUU TNI ATIATI SEMUANYA hmm jangan lupa");
        daftarBuku[27] = new BukunyaDevi("Demokrasi di Indonesia", "Megawati Soekarnoputri", 2017, "Buku Demokrasi", "Politik", "Sinopsis demokrasiH. DEMOKRASI ATAU DEMOKRASI INI KALO SEKARANG HMM HMM HMM");
        daftarBuku[28] = new BukunyaDevi("Politik Global", "Jokowi", 2021, "Alpukat", "Politik", "Sinopsis politik global.politik politik dan politik oke  TAMBAH APA YAAAAAAAAA KALAU MAU NYALIN BANYAK BANGET KURENG SIH KAN INI BOONG BOONGAN");
        daftarBuku[29] = new BukunyaDevi("Politik Tanah Air", "Prabowo Subianto", 2020, "Sains Politik", "Politik", "Sinopsis politik tanah air. Nih belajar semua Orang Indo harus peduli PEDULI ABISINI UTS");

        // Fiksi
        daftarBuku[30] = new BukunyaDevi("Laskar Pelangi", "Andrea Hirata", 2005, "Bentang Pustaka", "Fiksi", "Sinopsis Laskar Pelangi.Katanya eh gaboleh gibah beli lah bukunya MASI 9 HMM");
        daftarBuku[31] = new BukunyaDevi("Aroma Karsa", "Dee Lestari", 2018, "Kompas", "Fiksi", "Sinopsis Aroma Karsa. Apa tuh Kak Aroma Karsa taunya Aroma pandan MAU PE O?" );
        daftarBuku[32] = new BukunyaDevi("Supernova", "Dewa Eka Prayoga", 2016, "Gramedia", "Fiksi", "Sinopsis Supernova. Lagu gasie ini aku gatau sinopsisnya kalo nyalin iyuee banyak betul");
        daftarBuku[33] = new BukunyaDevi("Bumi Manusia", "Pramoedya Ananta Toer", 1980, "Pustaka Jaya", "Fiksi", "Sinopsis Bumi Manusia. Ini di bioskop 3 JaM ampe capek duduk waktu esepe sih mayan lah 7 kali nangis emng gembeng ");
        daftarBuku[34] = new BukunyaDevi("Hujan", "Tere Liye", 2017, "Republik Publisher", "Fiksi", "Sinopsis Hujan.Tirai hujan basahi aku kujalani hidup sendiri eh belum loh dia 10 kata");

        for (BukunyaDevi buku : daftarBuku) {
            if (buku != null) {
                buku.tampilkanBuku();
                int jumlahKata = buku.hitungJumlahKataSinopsis();
                System.out.println("Jumlah kata sinopsis: " + jumlahKata);
                System.out.println();
            }
        }

        BukunyaDevi bukuSalinan = daftarBuku[0].copy();
        System.out.println("Buku hasil salinan:");
        bukuSalinan.tampilkanBuku();

        System.out.println("Tingkat kesamaan antar buku yang berurutan:");
        for (int i = 0; i < daftarBuku.length - 1; i++) {
            double kesamaan = daftarBuku[i].cekTingkatKesamaan(daftarBuku[i + 1]);
            System.out.println("Buku ke-" + (i + 1) + " & Buku ke-" + (i + 2) + ": " + kesamaan + "%");
        }
        

 // Untuk mengitung royalti 10% yang ada pada nomor 3 saya menggunakan array agar semua buku bisa terupdate.
// Untuk menghitung royalti 10% dari harga buku
// - Pertama saya pakai for loop untuk menghitung tiap buku dari daftarBuku.
// - Variabel hargaBuku menyimpan harga buku, saya buat bervariasi mulai dari Rp50.000 dan naik Rp1.000 tiap buku.
// - Kemudian saya memanggil method BukunyaDevi.hitungRoyalti(hargaBuku), ini adalah method static dengan 1 parameter.
// - Method ini otomatis menghitung 10% dari harga buku (misalnya harga 50.000, maka hasilnya 5.000).
// - Nilai hasil perhitungan saya simpan di variabel royalti10, lalu ditampilkan ke layar.
System.out.println("\nRoyalti 10% tiap buku:");
for (int i = 0; i < daftarBuku.length; i++) {
    double hargaBuku = 50000 + (i * 1000);
    double royalti10 = BukunyaDevi.hitungRoyalti(hargaBuku); // yang 1 parameter
    System.out.println("Buku ke-" + (i + 1) + " | Harga: Rp" + hargaBuku + " | Royalti (10%): Rp" + royalti10);
}

// Hitung royalti custom 15% untujnomor 4
// Untuk menghitung royalti dengan persen custom
// - Sama seperti sebelumnya, saya menggunakan loop untuk setiap buku.
// - Kali ini saya memakai method hitungRoyalti yang menerima 2 parameter (harga buku dan persen).
// - Misalnya saya masukkan 15 sebagai persen, berarti royalti yang dihitung adalah 15% dari harga buku.
// - Hasilnya disimpan dalam royaltiCustom lalu ditampilkan.
System.out.println("\nRoyalti 15% tiap buku:");
for (int i = 0; i < daftarBuku.length; i++) {
    double hargaBuku = 50000 + (i * 1000);
    double royaltiCustom = BukunyaDevi.hitungRoyalti(hargaBuku, 15); // yang 2 parameter
    System.out.println("Buku ke-" + (i + 1) + " | Harga: Rp" + hargaBuku + " | Royalti (15%): Rp" + royaltiCustom);
}
    }
}
