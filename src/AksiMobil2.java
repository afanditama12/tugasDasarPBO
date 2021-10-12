public class AksiMobil2 {
    
    // membuat class
    static class Mobil2 {
        String warna;
        int tahunProduksi;
    
    void printMobil() {
        System.out.println("Warna : "+ warna);
        System.out.println("Tahun Produksi : "+tahunProduksi);
    }
    }

    public static void main(String[] args) {
        Mobil2 mobilku = new Mobil2();
        mobilku.warna = "Biru";
        mobilku.tahunProduksi = 2012;
        mobilku.printMobil();
    }
}
