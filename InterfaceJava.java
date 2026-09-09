//
// interface BisaTerbang {
//   void terbang();
// }
//
// class Pesawat implements BisaTerbang {
//   @Override
//   public void terbang() {
//     System.out.println("pesawat terbang dengan menggunakan jet dan sayap");
//   }
// }
//
// class Drone implements BisaTerbang {
//   @Override
//   public void terbang() {
//     System.out.println("drone bisa terbang dengan baling baling");
//   }
// }

// interface Pembayaran {
//   void bayar();
// }
//
// class EWallet implements Pembayaran {
//   @Override
//   public void bayar() {
//     System.out.println("bayar dengan menggunakan e wallet");
//   }
// }

interface BisaTerbang {
  void terbang();
}

interface BisaRecord {
  void record();
}

class Drone implements BisaTerbang, BisaRecord {
  @Override
  public void terbang() {
    System.out.println("drone terbang");
  }

  @Override
  public void record() {
    System.out.println("drone bisa record juga");
  }
}

public class InterfaceJava {
  public static void main(String[] args) {
    // Drone droneKita = new Drone();
    // Pesawat pesawatKita = new Pesawat();
    //
    // pesawatKita.terbang();
    // droneKita.terbang();

    // Pembayaran pembayaranKita = new EWallet();

    
  }
}
