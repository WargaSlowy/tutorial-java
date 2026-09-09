public class Produk {
  private String nama;
  private int harga;

  Produk(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
  }

  void tampilinInformasi() {
    System.out.println("Produk: " + nama);
    System.out.println("Harga: Rp." + harga);
  }
}
