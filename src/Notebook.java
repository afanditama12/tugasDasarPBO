public class Notebook {

    int lebarlayar;
    String warna;

    Notebook(int lebarlayar, String warna) { // constructor dengan parameter
        this.lebarlayar = lebarlayar; // this menyatakan atribut=parameter
        this.warna = warna;
    }

    public void tulisInfoNotebook() { //nama method adalah tulisInfoNotebook
        System.out.println("Lebar layar notebook: " +lebarlayar);
        System.out.println("Warna notebook: " +warna);
        
    }

}
