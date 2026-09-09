// class Player {
//   private int darah;
//
//   public int getDarah() {
//     return darah;
//   }
//
//   public int setDarah(int darah) {
//     this.darah = darah;
//   }
// }

// class Bank {
//   private double saldo;
//
//   public void isiSaldo(double saldo) {
//     if (saldo < 0 || saldo >= 999_999_999) {
//       System.out.println("saldo tidak boleh dibawah nol atau melebih batas");
//       System.out.println("yang dimasukkan adalah: " + saldo);
//     } else {
//       this.saldo += saldo;
//     }
//   }
//
//   public double tampilkanSaldo() {
//     return saldo;
//   }
//
//   public void ambilSaldo(double saldo) {
//     if (saldo < 0) {
//       System.out.println("saldo tidak boleh di bawah nol atau melebihi batas");
//     } else if (saldo > this.saldo) {
//       System.out.println("saldo yang kamu tarik tidak cukup");
//     } else {
//       this.saldo -= saldo;
//     }
//   }
// }

class Pembayaran {
  public void bayar(double saldo) {
    validasiJumlah(saldo);
    prosesBayar(saldo);
    simpanTransaksiBayar();
  }

  private void validasiJumlah(double saldo) {
    if (saldo < 0) {
      System.out.println("nilai tidak boleh minus untuk saldo");
    } else {
      System.out.println("validasi aman");
    }
  }

  private void prosesBayar(double saldo) {
    if (saldo < 0) {
      System.out.println("nilai tidak boleh minus untuk saldo");
    } else {
      System.out.println("proses pembayaran aman");
    }
  }

  private void simpanTransaksiBayar() {
    System.out.println("simpan transaksi bayar");
  }
}

public class Enkapsulasi {
  public static void main(String[] args) {
    Pembayaran bayarPertama = new Pembayaran();
    bayarPertama.bayar(100_000);
  }
}
