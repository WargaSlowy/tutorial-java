// class MesinKopi {
//   public void buatKopi() {
//     panasinAir();
//     grindKopi();
//     seduhKopi();
//
//     System.out.println("kopi sudah siap");
//   }
//
//   private void panasinAir() {
//     System.out.println("memanasin air");
//   }
//
//   private void grindKopi() {
//     System.out.println("grinding kopi");
//   }
//
//   private void seduhKopi() {
//     System.out.println("seduh kopi");
//   }
// }

// knight
// pemanah
// mage

// abstract class Karakter {
//   protected String nama;
//   protected int health;
//
//   public Karakter(String nama, int health) {
//     this.nama = nama;
//     this.health = health;
//   }
//
//   public abstract void serang();
//
//   public void berjalan() {
//     System.out.println(nama + " berjalan");
//   }
//
//   public void tampilinDarah() {
//     System.out.println("darah: " + health);
//   }
// }
//
// class Petarung extends Karakter {
//   public Petarung(String nama, int health) {
//     super(nama, health);
//   }
//
//   @Override
//   public void serang() {
//     System.out.println(nama + " menyerang dengan tombak dan pedang");
//   }
// }
//
// class Mage extends Karakter {
//   public Mage(String nama, int health) {
//     super(nama, health);
//   }
//
//   @Override
//   public void serang() {
//     System.out.println(nama + " serang dengan fireball");
//   }
// }
//

abstract class Pembayaran {
  protected double saldo;

  public Pembayaran(double saldo) {
    this.saldo = saldo;
  }

  public abstract void bayar();
}

class PembayaranKartuKredit extends Pembayaran {
  public PembayaranKartuKredit(double saldo) {
    super(saldo);
  }

  @Override
  public void bayar() {
    System.out.println("bayar dengan jumlah: Rp." + saldo + " dengan kartu kredit");
  }
}

public class Abstraksi {
  public static void main(String[] args) {
    // MesinKopi mesinKopiKita = new MesinKopi();
    //
    // mesinKopiKita.buatKopi();

    // Petarung petarungPertama = new Petarung("arfy", 100);
    // Karakter karakterKedua = new Mage("james", 100);
    // petarungPertama.serang();
    // karakterKedua.serang();

    Pembayaran pembayaranPertama = new PembayaranKartuKredit(200_000);
    pembayaranPertama.bayar();
  }
}
