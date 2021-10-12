public class AksiMahasiswa {
    static class Mahasiswa {
        private String nama;
        private int npm;

        public void setNama(String nm) {
            nama = nm;
        }

        public String getNama() {
            return nama;
        }

        public void setNPM(int npm) {
            this.npm = npm;
        }

        public int getNPM() {
            return npm;
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.setNama("Affandi Febrinsa Pratama");
        mhs.setNPM(2113020039);

        System.out.println("Nama : "+mhs.getNama());
        System.out.println("NPM : "+mhs.getNPM());
    }
}
