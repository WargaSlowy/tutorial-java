class Mahasiswa {
  String nama;
  int umur;
  String jurusan;
  double ipk;
}

public class Kelas {

  public static void main(String[] args) {

    Mahasiswa mahasiswaPertama = new Mahasiswa();
    Mahasiswa mahasiswaKedua = new Mahasiswa();

    mahasiswaPertama.nama = "Arfy";
    mahasiswaPertama.umur = 20;
    mahasiswaPertama.jurusan = "Memasak";
    mahasiswaPertama.ipk = 3.67;

    mahasiswaKedua.nama = "james";
    mahasiswaKedua.umur = 20;
    mahasiswaKedua.jurusan = "Komputer";
    mahasiswaKedua.ipk = 3.67;

    System.out.println("nama adalah: " + mahasiswaPertama.nama + " ipk: " + mahasiswaPertama.ipk);
    System.out.println("nama adalah: " + mahasiswaKedua.nama + " ipk: " + mahasiswaKedua.ipk);

  }
}
