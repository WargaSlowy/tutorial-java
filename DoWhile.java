import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // do {
    // kode
    // } while (kondisi);

    // int angka = 20;
    //
    // do {
    // System.out.println(angka);
    // angka--;
    // } while (angka >= 1);

    // int pilihan;
    //
    // do {
    // System.out.println("1. bayar");
    // System.out.println("2. tarik");
    // System.out.println("3. keluar");
    //
    // System.out.print("masukkan menu: ");
    // pilihan = input.nextInt();
    // } while (pilihan != 3);

    // int angka;
    //
    // do {
    // System.out.print("masukkan angka: ");
    // angka = input.nextInt();
    //
    // if (angka > 5) {
    // System.out.println("kelebihan");
    // } else if (angka < 5) {
    // System.out.println("kekurangan");
    // }
    //
    // } while (angka != 5);

    // int angka = 1;
    // boolean aktif = true;
    //
    // do {
    // System.out.println("angka ke " + angka);
    // angka++;
    // } while (angka <= 5 && aktif);

    // do {
    // System.out.println("looping teros");
    // } while (true);

    // int angka = 1;
    //
    // do {
    // System.out.println(angka);
    // } while (angka <= 5);

    // int i = 1;
    //
    // do { // outer looping
    // int j = 1;
    //
    // do { // inner looping
    // System.out.println("i -> " + i + " j -> " + j);
    // j++;
    // } while (j <= 2); // kondisi dari inner looping
    // i++;
    // } while (i <= 3); // kondisi dari outer looping

    int angka = 1;

    do {
      if (angka % 2 == 0) {
        System.out.println("genap: " + angka);
      } else {
        System.out.println("ganjil: " + angka);
      }

      angka++;
    } while (angka <= 10);

  }
}
