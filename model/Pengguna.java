package model;

public class Pengguna {
  private String nama;

  public Pengguna(String nama) {
    this.nama = nama;
  }

  public void tampilinNama() {
    System.out.println("nama adalah: " + nama);
  }
}
