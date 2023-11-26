// Kelas Faktur yang menerapkan interface Barang
class Faktur implements Barang {
    private String noFaktur;
    private Barang barang;
    private Pelanggan pelanggan;

    // Constructornya
    public Faktur(String noFaktur, Barang barang, Pelanggan pelanggan) {
        this.noFaktur = noFaktur;
        this.barang = barang;
        this.pelanggan = pelanggan;
    }

    // Implementasi hitung total()
    @Override
    public double hitungTotal() {
        return barang.hitungTotal();
    }

    @Override
    public String toString() {
        return "No Faktur      : " + noFaktur + "\n" + barang.toString() + "\n" + pelanggan.toString() + "\nTotal Bayar   : " + hitungTotal();
    }
}
