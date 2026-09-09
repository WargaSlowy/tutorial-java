// class Hewan {
//   void suara() {
//     System.out.println("Hewan bersuara");
//   }
// }
//
// class Kucing extends Hewan {
//   @Override
//   void suara() {
//     System.out.println("miaw");
//   }
// }
//
// class Jerapah extends Hewan {
//   @Override
//   void suara() {
//     System.out.println("huhuh");
//   }
// }

class Karakter {
  public void serang() {
    System.out.println("karakter mencoba menyerang");
  }
}

class Knight extends Karakter {
  @Override
  public void serang() {
    System.out.println("knight menyerang dengan pedang");
  }
}

class Pemanah extends Karakter {
  @Override
  public void serang() {
    System.out.println("pemanah menyerang dengan panah");
  }
}

class Game {
  void serang(Karakter karakter) {
    karakter.serang();
  }
}

public class Polimorfisme {
  public static void main(String[] args) {
    // Hewan hewanPertama = new Kucing();
    // Hewan hewanKedua = new Jerapah();
    //
    // hewanPertama.suara();
    // hewanKedua.suara();
  
    // Karakter karakterPertama = new Knight();
    // Karakter karakterKedua = new Pemanah();
    //
    // karakterPertama.serang();
    // karakterKedua.serang();

    // Karakter karakter;
    //
    // int pilihan = 3;
    //
    // if (pilihan == 1) {
    //   karakter = new Knight();
    // } else {
    //   karakter = new Pemanah();
    // }
    //
    // karakter.serang();

    Game game = new Game();
    game.serang(new Pemanah());
  }
}
