import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingServer {
  public static void main(String[] args) {
    int nomorPort = 5000;

    try (ServerSocket server = new ServerSocket(nomorPort)) {
      System.out.println("server berjalan dengan port: " + nomorPort);

      Socket koneksiKlien = server.accept();
      System.out.println("klien berhasil terhubung dalam jaringan");

      BufferedReader pembaca = new BufferedReader(new InputStreamReader(koneksiKlien.getInputStream()));

      PrintWriter pengirim = new PrintWriter(koneksiKlien.getOutputStream(), true);
      String pesanKlien = pembaca.readLine();

      System.out.println("pesan dari klien yang berhasil koneksi: " + pesanKlien);
      pengirim.println("wello ini saya dari server yang berhasil koneksi dengan kamu");

      koneksiKlien.close();
    } catch (Exception error) {
      System.out.println("ada error: " + error.getMessage());
    }
  }
}

// ip address
// 192.168.1.0
// 8.8.8.8
//
// komputer pertama: 192.168.1.10 - web server, database, game server, aplikasi java
// komputer kedua: 192.168.1.20
//
// client
// server
//
// https:://google.com
//
// TCP - [1, 2, 3, 4] - paket 1 paket 2, 3, 4
// UDP - [1, 2, 3, 4] - paket 1 paket 2, 
//
// Socket
// ServerSocket
