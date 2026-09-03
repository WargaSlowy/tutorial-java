import java.util.Scanner;

public class IfStatement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("masukkan umur kamu: ");
    int umur = input.nextInt();

    System.out.print("masukkan nilai kamu: ");
    int nilai = input.nextInt();
    //
    // if (umur >= 18 && nilai >= 80) {
    // System.out.println("sudah cukup usia dan lulus");
    // } else if (umur >= 15 && nilai >= 70) {
    // System.out.println("masih remaja dan lulus");
    // } else if (umur >= 10 && nilai >= 60) {
    // System.out.println("kamu bentar lagi mau remaja dan kamu lulus");
    // } else {
    // System.out.println("kamu masih bocil");
    // }

    // if (umur >= 18) {
    //   if (nilai >= 80) {
    //     System.out.println("lulus");
    //   } else {
    //     System.out.println("tidak lulus");
    //   }
    // } else {
    //   if (nilai >= 80) {
    //     System.out.println("lulus tapi masih bocil");
    //   } else {
    //     System.out.println("keduanya tidak lulus");
    //   }
    // }

    input.close();
  }
}
