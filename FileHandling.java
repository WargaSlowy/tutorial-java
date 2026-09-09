import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.StandardOpenOption;

public class FileHandling {
  public static void main(String[] args) {
    // membuat file
    // membaca file
    // tulis file
    // tambahin file
    // menghapus file
    // ngecek keberadaan file
    // mengelola direktori

    // Path lokasiFile = Path.of("data", "data_pegawai.txt");
    Path lokasiDirektori = Path.of("dataBaruPertama", "dataBaruKedua", "dataBaruKetiga");
    // String isiBerkas = "saya belajar file handling di java";

    // if (Files.exists(lokasiFile)) {
    // System.out.println("file yang dibutuhkan ada");
    // } else {
    // System.out.println("file yang dicari tidak ada");
    // }

    // try {
    // Files.createFile(lokasiFile);
    // System.out.println("file yang dibuat berhasil");
    // } catch (IOException error) {
    // System.out.println("gagal dalam buat file, error: " + error);
    // }

    // try {
    // Files.writeString(lokasiFile, isiBerkas);
    // System.out.println("data sudah berhasil dibuat");
    // } catch (IOException error) {
    // System.out.println("gagal untuk nulis kata dalam file, error: " + error);
    // }

    // try {
    // String isiData = Files.readString(Path.of("data", "catatan.txt"));
    // System.out.println(isiData);
    // } catch (IOException error) {
    // System.out.println("gagal untuk baca data dalam file, error: " + error);
    // }

    // try (BufferedReader pembaca = Files.newBufferedReader(lokasiFile)) {
    // String baris;
    //
    // while ((baris = pembaca.readLine()) != null) {
    // System.out.println(baris);
    // }
    // } catch (IOException error) {
    // System.out.println("gagal untuk baca filenya, error: " + error);
    // }

    // try {
    // Files.writeString(lokasiFile, "\nBelajar Java Dengan Maksimal",
    // StandardOpenOption.APPEND);
    // } catch (IOException error) {
    // System.out.println("gagal untuk baca filenya, error: " + error);
    // }

    // try {
    //   Files.delete(lokasiFile);
    //   System.out.println("file data_pegawai.txt sudah dihapus");
    // } catch (IOException error) {
    //   System.out.println("gagal untuk hapus filenya, error: " + error);
    // }

    try {
      Files.createDirectories(lokasiDirektori);
      System.out.println("direktori sudah siap jadi");
    }  catch (IOException error) {
      System.out.println("gagal untuk buat direktorinya, error: " + error);
    }

  }
}
