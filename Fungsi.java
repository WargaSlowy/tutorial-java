import java.util.Scanner;

public class Fungsi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // String nama;
    // int umur;
    // int tampungNilai;
    //
    // System.out.print("masukkan nama: ");
    // nama = input.nextLine();
    //
    // System.out.print("masukkan umur: ");
    // umur = input.nextInt();
    //
    // sapaNama(nama,umur);
    //
    // tampungNilai = kasihSepuluh();

    // System.out.println("nilai yang saya panggil adalah: " + kalkulasi(3, 4));

    tampilinPesan(20);
    input.close();
  }

  // static void sapa() {
  // System.out.println("wello cik dari fungsi sapa");
  // }
  //
  // static void sapaNama(String nama, int umur) {
  // System.out.println("wello apa kabar " + nama + " kamu berumur " + umur);
  // }
  //
  // static int kalkulasi(int panjang, int lebar) {
  // if (panjang > 100) {
  // System.out.println("terlalu besar");
  // }
  // return panjang * lebar;
  // }

  static void tampilinPesan(int umur) {
    System.out.println(cekUmur(umur));
  }

  static String cekUmur(int umur) {
    if (umur >= 18) {
      return "Dewasa";
    }

    return "Belum Dewasa";
  }

}
