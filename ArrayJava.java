// class Player {
//   private String nama;
//
//   public Player(String nama) {
//     this.nama = nama;
//   }
//
//   public String getNama() {
//     return this.nama;
//   }
// }
//
// abstract class Karakter {
//   public abstract void serang();
// }
//
// class Petarung extends Karakter {
//   @Override
//   public void serang() {
//     System.out.println("Petarung menyerang dengan tombak dan pedang");
//   }
// }
//
// class Pemanah extends Karakter {
//   @Override
//   public void serang() {
//     System.out.println("Pemanah menyerang dengan panah");
//   }
// }
//
// class Mage extends Karakter {
//   @Override
//   public void serang() {
//     System.out.println("Mage menyerang dengan fireball");
//   }
// }
//

public class ArrayJava {
  public static void main(String[] args) {
    // int[] nilai = {80, 90, 75, 85, 95};
    // String[] nama = {"arfy", "james", "riski", "damar"};
    //
    // System.out.println("nilai ke posisi 2: " + nilai[0]);
    //
    // nilai[2] = 200;
    // System.out.println("nilai sekarang pada posisi ke 3 adalah: " + nilai[2]);
    
    // int[] angk = new int[5];
    // System.out.println("nilai pada elemen terkahir adalah: " + nilai[nilai.length - 1]);
    
    // for (int i = 0; i < nilai.length; i++) {
    //   System.out.println("nilainya adalah: " + nilai[i]);
    // }

    // for (int nilaiElemen : nilai) {
    //   System.out.println("nilainya adalah: " + nilaiElemen);
    // }

    // Player[] playerKita = new Player[3];
    //
    // playerKita[0] = new Player("james");
    // playerKita[1] = new Player("arthur");
    // playerKita[2] = new Player("arfy");
    //
    // System.out.println(playerKita[0].getNama());

    // Karakter[] karakterKita = {
    //   new Petarung(),
    //   new Pemanah(),
    //   new Mage(),
    // };
    //
    // for (Karakter karakterData : karakterKita) {
    //   karakterData.serang();
    // }

    // int[][] matriks = {
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9}
    // };
    //
    //
    // for (int i = 0; i < matriks.length; i++) {
    //   for (int j = 0; j < matriks[i].length; j++) {
    //     System.out.println(matriks[i][j] + " ");
    //   }
    //
    // }

    int[] angkaKita = {10, 20, 30};
    int[] angkaKedua = angkaKita;

    angkaKedua[0] = 1000;
    System.out.println(angkaKita[0]);
    System.out.println(angkaKedua[0]);
  }
}
