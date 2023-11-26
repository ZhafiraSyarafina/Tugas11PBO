// Kelas BarangBiasa sebagai implementasi interface Barang
class BarangBiasa implements Barang {
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBeli;

    // Construsstor untuk atribut
    public BarangBiasa(String namaBarang, double hargaBarang, int jumlahBeli) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    // Implementasi hitungTotal() dari kelas Barang
    @Override
    public double hitungTotal() {
        return hargaBarang * jumlahBeli;
    }

    // Override untuk representasi string objek
    @Override
    public String toString() {
        return "Nama Barang    : " + namaBarang + "\nHarga Barang   : " + hargaBarang + "\nJumlah Beli    : " + jumlahBeli;
    }
}