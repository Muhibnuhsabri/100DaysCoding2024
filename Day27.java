package coding100day;

public class evaluasiBesar {
    
    public static void main(String[] args) {
        
        //soal nomor 1
        
        System.out.println("selamat datang di perpustakan film favorit!");
        final int jumlahFilm = 50; //ini adalah konstanta
        String namaFilm = "boboyboy";
        short tahunRilis = 2015;
        namaFilm = "from";
        
        System.out.printf("film berjudul %s di rilis pada tahun %d dan terdapat %d film dalam katalog\n\n",namaFilm,tahunRilis,jumlahFilm);
        
        //soal nomor 2
        
        System.out.println("selamat datang di catatan siswa kelas!");
        Integer jumlahSiswa = 30; //ini adalah constanta
        String namaSiswa = "budi";
        double nilaiSiswa = 85.5;
        namaSiswa = "andi";
        
        System.out.printf("Siswa bernama %s memiliki nilai %.1f. Jumlah siswa di kelas saat ini adalah %d\n\n",namaSiswa,nilaiSiswa,jumlahSiswa);
        
        //soal nomor 3
        
        System.out.println("selamat datang di sistem pengolaan stok tanaman!");
        int jumlahTanaman = 100;
        String namaTanaman = "melati";
        final double tinggiTanaman = 50.0; //ini adalah konstanta
        jumlahTanaman = 140;
        
        System.out.printf("Tanaman bernama %s memiliki tinggi %.1f cm. Jumlah stok tanaman saat ini adalah %d\n\n",namaTanaman,tinggiTanaman,jumlahTanaman);
        
        //soal nomor 4
        
        System.out.println("selamat datang di catatan inventaris alat olahraga!");
        final Short jumlahAlat = 25; //ini adalah constanta
        String namaAlat = "Dumbbell";
        float beratAlat = 5.5f;
        namaAlat = "Barbell";
        beratAlat = 9.2f;
        
        System.out.printf("Alat Olahraga bernama %s memiliki berat %.1f kg. Jumlah alat yang tersedia saat ini adalah %d.\n\n",namaAlat,beratAlat,jumlahAlat);
        
        //soal nomor 5
        
        System.out.println("selamat datang di sistem catatan produk toko online!");
        final int jumlahProduk = 200; //ini adalah constanta
        String namaProduk = "laptop";
        double hargaProduk = 15000000.0;
        namaProduk = "smartphone";
        
        System.out.printf("Produk dengan nama %s memiliki harga Rp %.1f. Jumlah produk yang tersedia saat ini adalah %d.\n\n",namaProduk,hargaProduk,jumlahProduk);
        
        //soal nomor 6
        
        System.out.println("selamat datang di catatan data hewan kebun binatang wild park!");
        int jumlahHewan = 50;
        String namaHewan = "harimau";
        final Byte umurHewan = 5;
        namaHewan = "singa";
        
        System.out.printf("Hewan bernama %s memiliki umur %d tahun. Jumlah hewan yang tersedia saat ini adalah %d\n\n",namaHewan,umurHewan,jumlahHewan);
        
        
        //soal nomor 7
         
        System.out.println("selamat datang di catatan jadwal kegiatan sekolah cerdas mandiri!");
        Integer jumlahKegiatan = 10;
        final String namaKegiatan = "perayaaan hari kemerdekaan"; //ini adalah constanta
        float durasiKegiatan = 3.5f;
        durasiKegiatan = 4.5f;
        
        System.out.printf("Kegiatan %s memiliki durasi %.1f jam. Jumlah kegiatan yang direncanakan saat ini adalah %d",namaKegiatan,durasiKegiatan,jumlahKegiatan);
        
    }
    
}
