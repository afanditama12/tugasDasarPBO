public class Mobil2 {
    String warna;
    // field final artinya field dikunci / atau tidak perlu dimanipulasi di objeck
    final Integer tahunProduksi = 2018;

    void printMobil() {
        System.out.println("Warna Mobil Adalah " + warna);
        System.out.println("Tahun Produksi Mobil Adalah " + tahunProduksi);
    }
}
