public class AksiMobil {

    // membuat class
    static class Mobil {
        String warna;
        int tahunProduksi;
    }

    public static void main(String[] args) throws Exception {

        // Membuat object
        Mobil mobilku = new Mobil();

        // memanggil atribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2018;

        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
    }

}
