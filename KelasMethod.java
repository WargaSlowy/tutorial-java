class Mahasiswa {
  String nama;
  int umur;
  String jurusan;
  double ipk;

  void perkenalan() {
    System.out.println("wello " + nama);
    System.out.println("kamu di jurusan: " + jurusan);
    System.out.println("ipk kamu adalah: " + ipk);
  }

  String ambilNama() {
    return nama;
  }

  int ambilUmur() {
    return umur;
  }

  void setIpk(double ipkBaru) {
    ipk = ipkBaru;
  }
}

class Mobil {
  String merek;
  String warna;
  int tahunProduksi;

  void berjalan() {
    System.out.println("mobil berjalan");
  }

  void berhenti() {
    System.out.println("mobil berhenti");
  }
}

public class KelasMethod {

  public static void main(String[] args) {
    Mahasiswa mahasiswaPertama = new Mahasiswa();

    mahasiswaPertama.nama = "arfy";
    mahasiswaPertama.umur = 20;
    mahasiswaPertama.jurusan = "Memasak";
    mahasiswaPertama.ipk = 2.2;

    mahasiswaPertama.perkenalan();
    mahasiswaPertama.setIpk(3.9);
    mahasiswaPertama.perkenalan();
  }
}
