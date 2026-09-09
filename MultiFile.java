public class MultiFile {
  public static void main(String[] args) {
    Pengguna penggunaPertama = new Pengguna("arfy", 70);
    Produk produkPertama = new Produk("thinkpad p15 gen 2", 78_000_000);
    penggunaPertama.tampilinInformasi();
    produkPertama.tampilinInformasi();
  }
}
