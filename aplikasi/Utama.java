package aplikasi;

import model.Pengguna;

public class Utama {
  public static void main(String[] args) {
    Pengguna penggunaPertama = new Pengguna("arfy slowy");

    penggunaPertama.tampilinNama();
    // model.Pengguna pengguna = new model.Pengguna("arfy");
    // pengguna.tampilinNama();
  }
}
