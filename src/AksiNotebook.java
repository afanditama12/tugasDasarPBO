public class AksiNotebook {

    static class Notebook {
        static int lebarLayar;
        static String warna;

        Notebook(int lebarLayar, String warna) { // constructor dengan parameter
            this.lebarLayar = lebarLayar; // this menyatakan atribut = parameter
            this.warna = warna;
        }

        public static void tulisInfoNotebook() {
            System.out.println("Lebar Layar Notebook : " + lebarLayar);
            System.out.println("Warna Notebook : " + warna);
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook(14, "Hitam");
        Notebook.tulisInfoNotebook();
    }
}
