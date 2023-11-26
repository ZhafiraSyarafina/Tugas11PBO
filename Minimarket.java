import java.util.Scanner;

public class Minimarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;

        // Loop do-while untuk input yang benar atau valid
        do {
            try {
                System.out.print("Masukkan Nomor Faktur   : ");
                String noFaktur = scanner.nextLine();

                System.out.print("Masukkan Nama Pelanggan : ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Masukkan Nama Barang    : ");
                String namaBarang = scanner.nextLine();

                System.out.print("Masukkan Harga Barang   : ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("Masukkan Jumlah Beli    : ");
                int jumlahBeli = scanner.nextInt();
           
                // Membuat objek Pelanggan 
                Pelanggan pelanggan = new Pelanggan(namaPelanggan);

                // Membuat objek BarangBiasa 
                Barang barang = new BarangBiasa(namaBarang, hargaBarang, jumlahBeli);

                // Membuat objek Faktur
                Faktur faktur = new Faktur(noFaktur, barang, pelanggan);

                // Menampilkan informasi faktur
                System.out.println("\nInformasi Faktur:\n" + faktur.toString());

                inputValid = true;

            // Menangkap kesalahan dan mencetak pesan apabila terjadi kesalahan
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan       : " + e.getMessage() + "\n");
                scanner.nextLine(); // Membersihkan newline 
            }
        } while (!inputValid);

        scanner.close(); //Menutup scanner apabila telah benar atau valid
    }
}