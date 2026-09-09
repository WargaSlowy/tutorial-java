import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // for (inisialisasi; kondisi; updateData) {
    //    System.out.println("");
    // }

    // for (int i = 0; i <= 16; i++) {
    //   if (i % 2 == 0) {
    //     System.out.println("iterasi ke " + i + " adalah genap");
    //   } else {
    //     System.out.println("iterasi ke " + i + " adalah ganjil");
    //   }
    // }

    // int iterasi = 0;
    //
    // for (; iterasi < 5; iterasi++) {
    //   System.out.println("iterasi ke " + iterasi);
    // }

    // for (;;) {
    //   System.out.println("hehey infinite looping");
    // }
    
    // for (int i = 0; i >= 0; i++); {
    //   System.out.println("hehey infinite looping");
    // }

    // for (int i = 1; i <= 5; i++) {
    //   if (i == 3) {
    //     System.out.println("sudah capai nilai 3");
    //   }
    //
    //   System.out.println(i);
    // }
    //
    // for (int i = 1; i <= 3; i++) { // outer looping
    //   for (int j = 1; j <= 2; j++) { // inner looping
    //     System.out.println("i -> " + i + " dan j -> " + j);
    //   }
    // }

    // for (int i = 0; i < 10; i++) {
    //   i++;
    // }

    System.out.print("berapa kali looping: ");
    int jumlah = input.nextInt();

    for (int i = 1; i <= jumlah; i++) {
      System.out.println("iterasi ke -> " + i);
    }

    input.close();
  }
}
