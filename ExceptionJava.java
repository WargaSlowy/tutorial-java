
public class ExceptionJava {

  public static void main(String[] args) {
    // try catch

    // int angkaPertama = 10;
    // int angkaKedua = 0;
    //
    // try {
    //   int hasil = angkaPertama / angkaKedua;
    //   System.out.println(hasil);
    // } catch ( error) {
    //   System.out.println("operasi matematika tidak valid");
    // }

    // int[] nilai = {80, 90, 100};
    // int angkaPertama = 10;
    // int angkaKedua = 0;
    //
    //
    // try {
    //   System.out.println(nilai[1]);
    //   System.out.println("hasil: " + (angkaPertama / angkaKedua));
    // } catch (ArrayIndexOutOfBoundsException error) {
    //   System.out.println("yang kamu akses diluar batas indeks");
    // } catch (ArithmeticException error) {
    //   System.out.println("tidak bisa dibagikan dengan nol.");
    // } finally {
    //   System.out.println("semua operasi sudah dijalankan");
    // }

    try {
      bagiAngka();
    } catch (ArithmeticException error ) {
      System.out.println("pembagian dengan nol tidak valid");
    }
    
  }

  static void bagiAngka() {
    int hasil = 10 / 0;
  }

  // IOException
  // SQLException
  // FileNotFoundException
  // RuntimeException
}
