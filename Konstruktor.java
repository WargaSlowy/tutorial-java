// class Player {
//   String nama;
//   int health;
//   int level;
//
//   Player(String nama, int health, int level) {
//     this.nama = nama;
//     this.health = health;
//     this.level = level;
//
//     System.out.println("Konstruktor di inisialisasi dengan nama:");
//     System.out.println(this.nama);
//     System.out.println(this.health);
//     System.out.println(this.level);
//   }
//
//   void serang() {
//     System.out.println(this.nama + " menyerang");
//   }
// }

class Player {
  private String nama;
  private int health;

  public Player(String nama) {
    this.nama = nama;
    this.health = 100;
  }

  public void serang() {
    System.out.println("player " + nama + " menyerang");
  }

  public void tampilinData() {
    System.out.println("nama: " + nama);
    System.out.println("health: " + health);
  }

  public String getNama() {
    return this.nama;
  }

  public int getHealth() {
    return this.health;
  }
  
}

public class Konstruktor {
  public static void main(String[] args) {
    // Player playerPertama = new Player("arfy", 100, 1);
    //
    // playerPertama.serang();


    Player playerPertama = new Player("james");

    playerPertama.tampilinData();
    System.out.println(playerPertama.getHealth());

    // System.out.println(playerPertama.nama);
    // System.out.println(playerPertama.health);
  }
}
