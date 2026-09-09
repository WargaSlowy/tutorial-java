
public class OperatorUnary {
  public static void main(String[] args) {
    // +
    // -
    // ++
    // --

    // int angka = -10;
    // int hasilMinus = angka;
    // System.out.println(angka);
    // System.out.println(hasilMinus);
    
    // 10++ = 10 + 1 = 11 -> post-increment
    // ++10 = 1 + 10 = 11 -> pre-increment
    // int angka = 10;
    // int hasil = ++angka;
    // System.out.println("hasil dari pre-increment dari 10 adalah: " + hasil);
    int angka = 10;
    int hasil = --angka;
    System.out.println("hasil dari pre-decrement dari 10 adalah: " + hasil);
  }
}
