import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NetworkingClient {
  public static void main(String[] args) {
    String alamatServer = "localhost";
    int nomorPort = 5000;

    try (Socket koneksi = new Socket(alamatServer, nomorPort)) {
      PrintWriter pengirim = new PrintWriter(koneksi.getOutputStream(), true);
      BufferedReader pembaca = new BufferedReader(new InputStreamReader(koneksi.getInputStream()));

      pengirim.println("wello ini dari NetworkingClient java");
      
      String balasanDariServer = pembaca.readLine();
      System.out.println("pesan berhasil dikirim ke server");

      System.out.println("hasil dari server yaitu pesannya: " + balasanDariServer);
    } catch (Exception error) {
      System.out.println("Gagal koneksi ke server, error: " + error.getMessage());
    }
  }
}
