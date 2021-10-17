public class AksiMobil {

    public static void main(String[] args) {
        
        // object
        var mobil = new Mobil();

        // memberi value di field
        mobil.warna = "Merah";
        mobil.tahunProduksi = 2018;

        // memanggil / menampilkan objeck
        System.out.println("Warna Mobil Adalah " + mobil.warna);
        System.out.println("Tahun Produksi Mobil Adalah " + mobil.tahunProduksi);
    }
    
}
