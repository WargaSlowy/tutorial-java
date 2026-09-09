class Hewan {
  void suara() {
    System.out.println("hewan bersuara hyuu");
  }
}

// class Kucing extends Hewan {
//   @Override
//   public void suara() {
//     System.out.println("miaw");
//   }
// }

// abstract class Karakter {
//   abstract void serang();
// }

// class Orang {
//   String nama;
//
//   Orang(String nama) {
//     this.nama = nama;
//   }
// }

public class AnonymousClass {
  public static void main(String[] args) {
    Hewan hewanKita = new Hewan() {

      {
        System.out.println("object anonymous sudah dibuat");
      }

      @Override
      void suara() {
        System.out.println("miaw miaw");
      }

      
    };
    hewanKita.suara();
    //
    // Karakter karakterKita = new Karakter() {
    //   String nama = "arfy slowy";
    //   @Override
    //   void serang() {
    //     System.out.println(nama + " serang dengan menggunakan keris petir");
    //   }
    // };
    //
    // karakterKita.serang();

    // Orang orangPertama = new Orang("arfy slowy") {
    //   void wello() {
    //     System.out.println("wello " + nama);
    //   }
    // };
  }
}
