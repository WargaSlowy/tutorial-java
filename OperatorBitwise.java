public class OperatorBitwise {
  public static void main(String[] args) {
    // bitwise and -> &
    // bitwise or -> |
    // bitwise xor -> ^
    // bitwise not -> ~
    // shiffting kiri -> <<
    // shiffting kanan -> >>
    // shiffting kanan (unsigned) -> >>>

    // 0 & 0 -> 0
    // 1 & 0 / 0 & 1 -> 0
    // 1 & 1 -> 1
    // int hasilAnd = 5 & 3;

    // 5   = 0101
    // 3   = 0011
    // and = 0001 -> 1
    // System.out.println(hasilAnd);

    // 0 | 1 -> 1  terkecuali 0 | 0 -> 0
    // 1 | 1 -> 1
    
    // int hasilOr = 5 | 3;
    // 5   = 0101
    // 3   = 0011
    // or  = 0111 -> 7
    // System.out.println(hasilOr);

    // 0 ^ 0 -> 0
    // 0 ^ 1 -> 1
    // 1 ^ 0 -> 1
    // 1 ^ 1 -> 0

    // int hasilXor = 5 ^ 3;
    // 5   = 0101
    // 3   = 0011
    // xor = 0110 -> 6
    // System.out.println(hasilXor);

    // 0 -> ~ -> 1
    // 1 -> ~ -> 0
    // 0101 -> ~ -> 1010
    // angka = 5;
    // ~angka
    // 0000000 000000 0000000 000000101
    // 1111111 111111 1111111 111111010
    // int hasilComplement = ~5;
    // System.out.println(hasilComplement);

    // ~nilai = -(nilai + 1)
    // ~20 = -(20 + 1) = -21
    
    // 5 << 1;
    // 00001010
    // int hasilShiftingKiri = 5 << 1;
    // System.out.println(hasilShiftingKiri);

    // nilai << n;
    // nilai x 2^n
    // 5 << 2;
    // 5 x 2 ^ 2
    // 20
    
    // 20
    // 00010100
    // 20 >> 1
    // int hasilShiftingKanan = 20 >> 1;
    // System.out.println(hasilShiftingKanan);
    
    int a = 20;
    int x = a >> 1;
    int y = a >>> 1;
    System.out.println(x);
    System.out.println(y);
  }
}
