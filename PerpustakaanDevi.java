public class PerpustakaanDevi {
    public static void main(String[] args) {
        // menggunakan array
        //jumlah bukunya 35 
        //7 kategori dan perkategori5
        BukunyaDevi[] daftarBuku = new BukunyaDevi[35];

        daftarBuku[0] = new BukunyaDevi("Menyelami Teknologi", "Budi Raharjo", 2020, "Gramedia", "Teknologi", "Sinopsis tentang menyelami teknologi. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[1] = new BukunyaDevi("Revolusi Digital", "Soe Hok Gie", 2019, "Mizan", "Teknologi", "Sinopsis tentang revolusi digital.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[2] = new BukunyaDevi("Inovasi Tak Terbatas", "Arief Budiman", 2021, "Elex Media", "Teknologi", "Sinopsis tentang inovasi tak terbatas.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[3] = new BukunyaDevi("Teknologi Masa Depan", "Rani Suryani", 2022, "Indie Book", "Teknologi", "Sinopsis tentang teknologi masa depan.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[4] = new BukunyaDevi("Transformasi Digital", "Tomi Gunawan", 2020, "Alpukat", "Teknologi", "Sinopsis tentang transformasi digital.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[5] = new BukunyaDevi("AI Cerdas", "Fahmi Andri", 2021, "Deep Tech", "Teknologi", "Sinopsis tentang AI cerdas.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[6] = new BukunyaDevi("IoT untuk Pemula", "Yuniarto", 2019, "Smart Book", "Teknologi", "Sinopsis tentang IoT.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[7] = new BukunyaDevi("Cloud Computing", "Hana Lestari", 2020, "Digital Press", "Teknologi", "Sinopsis tentang cloud computing.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[8] = new BukunyaDevi("Big Data Era", "Joni Susanto", 2022, "Tech Media", "Teknologi", "Sinopsis tentang big data.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[9] = new BukunyaDevi("Blockchain Basics", "Dewi Kartika", 2019, "Crypto Books", "Teknologi", "Sinopsis tentang blockchain.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[10] = new BukunyaDevi("Keamanan Siber", "Ayu Pratiwi", 2020, "Cyber Press", "Teknologi", "Sinopsis tentang keamanan siber. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[11] = new BukunyaDevi("Robotika Modern", "Fajar Prabowo", 2021, "Robo Books", "Teknologi", "Sinopsis tentang robotika. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[12] = new BukunyaDevi("Pemrograman Java", "Rina Ayu", 2022, "Coding Press", "Teknologi", "Sinopsis tentang pemrograman Java. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[13] = new BukunyaDevi("Pemrograman Python", "Andi Syahputra", 2020, "Code World", "Teknologi", "Sinopsis tentang Python. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[14] = new BukunyaDevi("Pemrograman C++", "Wahyu Hermawan", 2019, "Programming Media", "Teknologi", "Sinopsis tentang C++. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[15] = new BukunyaDevi("Teknologi 5G", "Lia Kurniawati", 2021, "Network Press", "Teknologi", "Sinopsis tentang teknologi 5G. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[16] = new BukunyaDevi("Machine Learning", "Bambang Setiawan", 2020, "AI Books", "Teknologi", "Sinopsis tentang machine learning. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[17] = new BukunyaDevi("Data Science", "Novi Rahmawati", 2022, "Science Press", "Teknologi", "Sinopsis tentang data science.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[18] = new BukunyaDevi("Mobile Apps", "Dedi Santoso", 2019, "Mobile Tech", "Teknologi", "Sinopsis tentang mobile apps.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[19] = new BukunyaDevi("Web Development", "Indra Saputra", 2021, "Web Media", "Teknologi", "Sinopsis tentang web development.");
        daftarBuku[20] = new BukunyaDevi("UX Design", "Desi Indah", 2020, "Creative Book", "Teknologi", "Sinopsis tentang UX design. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[21] = new BukunyaDevi("Game Development", "Eka Prasetya", 2022, "Game Press", "Teknologi", "Sinopsis tentang game development. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[22] = new BukunyaDevi("Teknologi Ramah Lingkungan", "Putri Sari", 2020, "Eco Tech", "Teknologi", "Sinopsis tentang teknologi ramah lingkungan.");
        daftarBuku[23] = new BukunyaDevi("Teknologi Medis", "Taufik Hidayat", 2021, "Health Tech", "Teknologi", "Sinopsis tentang teknologi medis. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[24] = new BukunyaDevi("Virtual Reality", "Ika Fauziah", 2022, "VR Media", "Teknologi", "Sinopsis tentang virtual reality. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[25] = new BukunyaDevi("Augmented Reality", "Bayu Mahardika", 2020, "AR Books", "Teknologi", "Sinopsis tentang augmented reality.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[26] = new BukunyaDevi("Teknologi Satelit", "Sari Dewi", 2019, "Space Media", "Teknologi", "Sinopsis tentang teknologi satelit.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[27] = new BukunyaDevi("Smart Home", "Hendro Putra", 2021, "Smart Tech", "Teknologi", "Sinopsis tentang smart home. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[28] = new BukunyaDevi("Teknologi Pangan", "Ratna Sari", 2020, "Food Tech", "Teknologi", "Sinopsis tentang teknologi pangan.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[29] = new BukunyaDevi("Teknologi Energi", "Halim Gunawan", 2022, "Energy Media", "Teknologi", "Sinopsis tentang teknologi energi.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[30] = new BukunyaDevi("Cybersecurity Advanced", "Riza Rahman", 2020, "Cyber Book", "Teknologi", "Sinopsis tentang cybersecurity.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[31] = new BukunyaDevi("Wearable Technology", "Nurul Azizah", 2021, "WearTech", "Teknologi", "Sinopsis tentang wearable technology.Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[32] = new BukunyaDevi("Teknologi Otomotif", "Agus Santoso", 2019, "Auto Books", "Teknologi", "Sinopsis tentang teknologi otomotif. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[33] = new BukunyaDevi("Teknologi Transportasi", "Dwi Setyo", 2020, "Trans Book", "Teknologi", "Sinopsis tentang teknologi transportasi. Klo mau tau beli ya plis beli jgnn bajakan");
        daftarBuku[34] = new BukunyaDevi("Smart City", "Rika Ayuningtyas", 2021, "City Tech", "Teknologi", "Sinopsis tentang smart city.bli lah capek aku suda ini kode ku ke cut dan gatau deh.");
//buat menampilksn urutan buku dan jumlah kata sinopsis
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i] != null) {
                daftarBuku[i].tampilkanBuku();
                int jumlahKata = daftarBuku[i].hitungJumlahKataSinopsis();
                System.out.println("Jumlah kata sinopsis buku ke-" + (i+1) + ": " + jumlahKata);
                System.out.println();
            }
        }
        BukunyaDevi bukuSalinan = daftarBuku[0].copy();


        System.out.println("buku hasil salinan:");
        bukuSalinan.tampilkanBuku();


 
        double kesamaan = daftarBuku[0].cekTingkatKesamaan(daftarBuku[1]);
        System.out.printf("tingkat kesamaan antara buku pertama dan kedua: %.2f%%\n", kesamaan);
         // 3.penambahan kodeuntuk  memanggil static method hitungroyalti 1 parameter (otomatis 10%)
         System.out.println("royalti 10%: rp " + BukunyaDevi.hitungRoyalti(100000)); // hasil: royalti 10%: rp 10000.0

         // 4.penambahan kodeuntuk memanggil static method hitungroyalti 2 parameter (persen custom)
         System.out.println("royalti custom 20%: rp " + BukunyaDevi.hitungRoyalti(100000, 20)); // hasil: royalti custom 20%: rp 20000.0
     }
    }        

     
