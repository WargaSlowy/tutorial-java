import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // System.out.print("masukkan nilai kamu: ");
    // int nilai = input.nextInt();
    //
    // switch (nilai) {
    // case 1:
    // System.out.println("kamu memlih nilai 1 dan kamu masuk pintu pertama");
    // System.out.println("dan selamat");
    // System.out.println("nilai kamu ditambahkan degan 1: " + (nilai + 1));
    // break;
    // case 7:
    // System.out.println("kamu memilih nilai 7 dan kamu masuk pintu keempat");
    // break;
    // default:
    // System.out.println("kamu tidak memenuhi kriteria");
    // }

    // System.out.print("masukkan nilai: ");
    // int nilaiPertama = input.nextInt();
    //
    // System.out.print("masukkan nilai kedua: ");
    // int nilaiKedua = input.nextInt();
    //
    // System.out.print("masukkan operator: ");
    // String operator = input.next();
    //
    // switch (operator) {
    // case "+", "tambah":
    // System.out.println("hasilnya adalah: " + (nilaiPertama + nilaiKedua));
    // break;
    // case "-", "kurang", "kurangi", "subtract":
    // System.out.println("hasilnya adalah: " + (nilaiPertama - nilaiKedua));
    // break;
    // default:
    // System.out.println("tidak ada operatornya!");
    // }

    // int hari = 2;
    //
    // String namaHari = switch (hari) {
    // case 1 -> "Senin";
    // case 2 -> "Selasa";
    // default -> "tidak ada hari";
    // };
    //
    // System.out.println(namaHari);

    int menu = 2;

    switch (menu) {
      case 1 -> {
        System.out.println("memilih menu 1");
        System.out.println("ikan bakar");
      }
      case 2 -> {
        System.out.println("memilih menu 2");
        System.out.println("mie goreng");
      }

      default -> System.out.println("menu diketahui");
    }

    input.close();
  }
}
