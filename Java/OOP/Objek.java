package OOP;

public class Objek {
String nama;
  int berat; 
  int JumlahKaki;

  public Objek(String namaOrang) {
    nama = namaOrang;
  }

  public void beratOrang(int beratOrang) {
    berat = beratOrang;
}
  public void JumlahKakiOrang(int JumlahKakiOrang) {
    JumlahKaki = JumlahKakiOrang;
  }

  public void cetakObjek() {
    System.out.println("Nama orang : " + nama);
System.out.println("Berat orang : " + berat + " kg");
    System.out.println("JumlahKaki : " + JumlahKaki);
  }
}
