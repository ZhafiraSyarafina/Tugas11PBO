// Kelas Pelanggan kelas turunan
class Pelanggan {
    private String namaPelanggan;

    //Constructornya
    public Pelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    // Override untuk representasi string objek
    @Override
    public String toString() {
        return "Nama Pelanggan : " + namaPelanggan;
    }
}