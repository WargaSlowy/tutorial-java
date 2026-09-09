public class Pengguna {
  private String nama;
  private int umur;

  Pengguna(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
  }

  void tampilinInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("umur: " + umur +  " tahun");
  }
}
