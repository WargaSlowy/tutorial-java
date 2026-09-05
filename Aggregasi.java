// class Guru {
//     String nama;
//
//     Guru(String nama) {
//         this.nama = nama;
//     }
// }
//
// class Mahasiswa {
//   String nama;
//
//   Mahasiswa(String nama) {
//     this.nama = nama;
//   }
// }
//
// class Departemen {
//   String namaDepartemen;
//   Guru guru;
//   Mahasiswa mahasiswa;
//
//   Departemen(String namaDepartemen, Guru guru, Mahasiswa mahasiswa) {
//     this.namaDepartemen = namaDepartemen;
//     this.guru = guru;
//     this.mahasiswa = mahasiswa;
//   }
// }

// class Player {
//   String nama;
//
//   Player(String nama) {
//     this.nama = nama;
//   }
// }
//
// class Pelatih {
//   String namaPelatih;
//
//   Pelatih(String namaPelatih) {
//     this.namaPelatih = namaPelatih;
//   }
// }
//
// class Tim {
//   String namaTim;
//   Player player;
//   Pelatih pelatih;
//
//   Tim(String namaTim, Player player, Pelatih pelatih) {
//     this.namaTim = namaTim;
//     this.player = player;
//     this.pelatih = pelatih;
//   }
// }

class Player {
  private String nama;

  public Player(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }
}

class Tim {
  private String nama;
  private Player player;

  public Tim(String nama, Player player) {
    this.nama = nama;
    this.player = player;
  }

  public void tampilinIngpo() {
    System.out.println("nama Tim: " + nama);
    System.out.println("Player: " + player.getNama());
  }
}

public class Aggregasi {
  public static void main(String[] args) {
    // Guru guruPertama = new Guru("james");
    // Mahasiswa mahasiswaPertama = new Mahasiswa("arfy");
    // Departemen departemenPertama = new Departemen("computer science",
    // guruPertama, mahasiswaPertama);
    //
    // System.out.println(departemenPertama.namaDepartemen);
    // System.out.println(departemenPertama.guru.nama);
    // System.out.println(departemenPertama.mahasiswa.nama);

    // Player player = new Player("marilyn");
    // Pelatih pelatihPertama = new Pelatih("kaiden");
    //
    // Tim timWargaSlowy = new Tim("WargaSlowyEsport", player, pelatihPertama);
    //
    // System.out.println(timWargaSlowy.namaTim);
    // System.out.println(timWargaSlowy.player.nama);
    // System.out.println(timWargaSlowy.pelatih.namaPelatih);

    Player player = new Player("marilyn");

    Tim tim = new Tim("WargaSlowyEsport", player);

    tim.tampilinIngpo();
  }
}
