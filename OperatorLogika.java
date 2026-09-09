public class OperatorLogika {
  public static void main(String[] args) {
    // && and -> benar jika kedua boolean yang diberikan benar
    // || or -> benar jika salah satu diantaranya benar
    // ! not -> ngebalikin salah satu nilai boolean

    // boolean a = false;
    // boolean b = true;

    // &&
    // System.out.println(a && b);
    

    // ||
    // System.out.println(a || b);

    // !
    // System.out.println(!a);
    // System.out.println(!b);

    int umur = 17;
    int tinggi = 175;
    boolean hasil = umur >= 18 || tinggi >= 170;
    System.out.println(hasil);
  }
}
