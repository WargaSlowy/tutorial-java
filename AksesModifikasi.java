// public
// protected
// default
// private

// class Player {
//   private String nama;
//   private int health;
//
//   public void infoPlayer() {
//     System.out.println("nama player: " + nama);
//     System.out.println("darah player: " + health);
//   }
//
//   public void setHealth(int darah) {
//     if (darah >= 0 && darah <= 100) {
//       this.health = darah;
//     } else {
//       System.out.println("tidak boleh mengganti darah sembarangan!");
//       System.out.println("kamu set darahnya yaitu: " + darah);
//     }
//   }
//
//   public int getHealth() {
//     return this.health;
//   }
//
//   public void setNama(String nama) {
//     this.nama = nama;
//   }
//
//   public String getNama() {
//     return this.nama;
//   }
// }

class Player {
  protected int health;
  protected String nama;
  protected int damage;

}

 class Karakter extends Player {
  void tampilkanDarah() {
    System.out.println(health);
  }

  void tampilkanNama() {
    System.out.println(nama);
  }

  public void serang() {
    int damage = setDamage();

    System.out.println(this.nama + " menyerang dengan damage: " + damage);
  }

  private int setDamage() {
    this.damage = hitungDamage();
    return this.damage;
  }

  private int hitungDamage() {
    return 9000;
  }
}

public class AksesModifikasi {
  public static void main(String[] args) {
    // Player playerPertama = new Player();
    //
    // playerPertama.setNama("james");
    // playerPertama.setHealth(90);
    // playerPertama.infoPlayer();
    //
    // int darahPlayer = playerPertama.getHealth();
    // System.out.println(darahPlayer);

  
    Karakter karakterPertama = new Karakter();

    karakterPertama.nama = "kaiden";
    karakterPertama.health = 100;

    karakterPertama.tampilkanDarah();
    karakterPertama.tampilkanNama();
    karakterPertama.serang();
  }
}
