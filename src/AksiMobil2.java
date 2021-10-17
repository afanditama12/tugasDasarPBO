public class AksiMobil2 {
    public static void main(String[] args) {
        
        // buat objeck
        var mobil2 = new Mobil2();
        
        // manipulasi field yang telah dibuat
        mobil2.warna = "Merah";
        // untuk tahun produksi tidak perlu melakukan manipulasi field
        // karena telah di set menjadi field atau dikunci

        // panggil(akses) dan menampilkan method yang telah dibuat
        mobil2.printMobil();

    }
}
