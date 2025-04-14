public class nyoba01 {
 String nim, nama, kelas, lomba;
 double ipk;
 int peringkat;
 

 public nyoba01(String nim, String nama, String kelas, String lomba, double ipk, int peringkat){
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.lomba = lomba;
    this.ipk = ipk;
    this.peringkat = peringkat;
 }

 public void tampil(){
    System.out.println("NIM      : " + nim);
    System.out.println("Nama     : " + nama);
    System.out.println("Kelas    : " + kelas);
    System.out.println("IPK      : " + ipk);
    System.out.println("Lomba    : " + lomba);
    System.out.println("Peringkat: " + peringkat);
    System.out.println("-------------------------------------");
 }
}
