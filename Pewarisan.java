// // parent class / superclass
// class Karakter {
//   String nama;
//   int health;
//
//   void bergerak() {
//     System.out.println(nama + " sedang jalan nih");
//   }
// }
//
// // child class / subclass
// class Player extends Karakter {
//   Player(String nama) {
//     this.nama = nama;
//     this.health = 100;
//   }
//   void menyerang() {
//     System.out.println(nama + " menyerang");
//   }
// }
//
// class Musuh extends Karakter {
//   Musuh(String nama) {
//     this.nama = nama;
//     this.health = 100;
//   }
//
//   void menghindar() {
//     System.out.println(nama + " menghindar");
//   }
// }

// class Karakter {
//   String nama;
//   private int health;
//
//   Karakter(String nama) {
//     this.nama = nama;
//   }
//
//   void tampilkanInfo() {
//     System.out.println("ini karakter");
//   }
//
//   void serang() {
//     System.out.println("seraaang");
//   }
//
//   public int getHealth() {
//     return this.health;
//   }
// }
//
// class Player extends Karakter {
//   Player(String nama) {
//     super(nama);
//   }
//
//   void tampilinInfoPlayer() {
//     super.tampilkanInfo();
//
//     System.out.println("player");
//   }
//
//   void tampilinHealth() {
//     System.out.println(getHealth());
//   }
//
//   @Override
//   void serang() {
//     System.out.println("player nyerang dengan fireball");
//   }
// }

class Karakter {
  private String nama;
  private int health;

  public Karakter(String nama, int health) {
    this.nama = nama;
    this.health = health;
  }

  public String getNama() {
    return nama;
  }

  public int getHealth() {
    return health;
  }

  public void berjalan() {
    System.out.println(nama + " berjalan");
  }

  public void menyerang() {
    System.out.println(nama + " menyerang serangan biasa aja");
  }
}

class Player extends Karakter{
  private int level;

  Player(String nama, int health, int level) {
    super(nama, health);
    this.level = level;
  }

  @Override
  public void menyerang() {
    System.out.println(getNama() + " menyerang menggunakan fireball");
  }

  public void tampilinLevel() {
    System.out.println("Level: " + level);
  }
}

public class Pewarisan {
  public static void main(String[] args) {
    // Player playerPertama = new Player("arfy");
    // Musuh musuhPertama = new Musuh("gorg");
    //
    // playerPertama.bergerak();
    // playerPertama.menyerang();
    //
    // musuhPertama.bergerak();
    // musuhPertama.menghindar();

    // Player playerPertama = new Player("arfy");
    // playerPertama.tampilinInfoPlayer();
    // playerPertama.serang();

    Player playerPertama = new Player("james", 200, 120);

    playerPertama.berjalan();
    playerPertama.menyerang();
    playerPertama.tampilinLevel();
  }
}
