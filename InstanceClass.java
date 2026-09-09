// class Mobil {
//   private String merek;
//   String warna;
//
//   void tampilinInfo() {
//     System.out.println("Merek: " + merek);
//     System.out.println("warna: " + warna);
//   }
//
//   void tampilinWarna() {
//     System.out.println("warna mobil adalah: " + warna);
//   }
//
//   void setMerekMobil(String merek) {
//     this.merek = merek;
//   }
// }

class Pemain {
  String  nama;
  int darah;

  static int jumlahPemain = 2;
  
  void serang() {
    System.out.println(nama + " menyerang dengan darah " + darah);
    System.out.println("jumlah: " + jumlahPemain);
  }
}

public class InstanceClass {
  public static void main(String[] args) {
    // Mobil mobilSaya = new Mobil();
    // Mobil mobilJames = new Mobil();
    //
    // mobilSaya.setMerekMobil("pagani");
    // mobilSaya.warna = "merah";
    //
    // mobilJames.setMerekMobil("lambo");
    // mobilJames.warna = "kuning";
    //
    // mobilSaya.tampilinInfo();

    Pemain pemainPertama = new Pemain();
    Pemain pemainKedua = new Pemain();

    pemainPertama.nama = "arfy";
    pemainPertama.darah = 100;

    pemainKedua.nama = "james";
    pemainKedua.darah = 100;

    pemainPertama.serang();
    pemainKedua.serang();
  }
}
