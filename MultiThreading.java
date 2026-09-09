public class MultiThreading {
  static int jumlah = 0;

  public static synchronized void tambahJumlah() {
    jumlah++;
  }

  public static void main(String[] args) throws InterruptedException {

    // Thread pekerja = new Thread(() -> {
    // System.out.println("thread pekerja lagi jalan");
    // });
    //
    // pekerja.start();
    // pekerja.run();
    //
    // System.out.println("thread dari utamanya tetap juga jalan");

    // Runnable tugasPertama = () -> {
    // for (int nomor = 1; nomor <= 5; nomor++) {
    // System.out.println("[tugas pertama] memproses data dengan nomor: " + nomor);
    // }
    // };
    //
    // Runnable tugasKedua = () -> {
    // for (int nomor = 1; nomor <= 5; nomor++) {
    // System.out.println("[tugas kedua] memproses data dengan nomor: " + nomor);
    // }
    // };
    //
    // Thread pekerjaPertama = new Thread(tugasPertama);
    // Thread pekerjaKedua = new Thread(tugasKedua);
    //
    // pekerjaPertama.start();
    // pekerjaKedua.start();

    // concurrency
    // parallelism

    // core 1 -> thread 1
    // core 2 -> thread 2

    // Thread downloadGambar = new Thread(() -> {
    // System.out.println("mulai download gambar");
    //
    // try {
    // Thread.sleep(3000);
    // } catch (InterruptedException error) {
    // System.out.println("download gambar gagal, error: " + error);
    // }
    //
    // System.out.println("download gambar kelar");
    // });
    //
    // Thread ambilDataGambar = new Thread(() -> {
    // System.out.println("mulai ambil data gambar");
    //
    // try {
    // Thread.sleep(2000);
    // } catch (InterruptedException error) {
    // System.out.println("fetching data gambar gagal, error: " + error);
    // }
    //
    // System.out.println("fetching data gambar kelar");
    // });
    //
    // Thread ambilDataLog = new Thread(() -> {
    // System.out.println("mulai ambil data log");
    //
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException error) {
    // System.out.println("ambil data logging error, error: " + error);
    // }
    //
    // System.out.println("ambil data logging aman");
    // });
    //
    // downloadGambar.start();
    // ambilDataGambar.start();
    // ambilDataLog.start();
    //
    //
    // Thread pekerja = new Thread(() -> {
    // System.out.println("memproses data faktual excel");
    // });
    //
    // pekerja.start();
    //
    // Thread pekerja = new Thread(() -> {
    //   System.out.println("memproses data faktual excel");
    //
    //   try {
    //     Thread.sleep(2000);
    //   } catch (InterruptedException error) {
    //     Thread.currentThread().interrupt();
    //   }
    //
    //   System.out.println("proses data faktual excel sudah siap");
    // });
    //
    // pekerja.start();
    // pekerja.join();
    //
    // System.out.println("program kelar");

    Thread pekerjaPertama = new Thread(() -> {
      for (int nomor = 0; nomor < 1_000_000; nomor++) {
        tambahJumlah();
      }
    });

    Thread pekerjaKedua = new Thread(() -> {
      for (int nomor = 0; nomor < 1_000_000; nomor++) {
        tambahJumlah();
      }
    });

    pekerjaPertama.start();
    pekerjaKedua.start();

    pekerjaPertama.join();
    pekerjaKedua.join();

    System.out.println("jumlah hasil adalah: " + jumlah);
  }

  // jumlah = 10;
  // thread pertama = baca 10
  // thread kedua = baca 10
  // thread pertama = 10 + 1 = 11
  // thread kedua = 10 + 1 = 11
}
