import java.util.Scanner;

public class demoDosen07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen07 daftarDosen = new dataDosen07();
        int pilihan;

        do{
            System.out.println("===== DOSEN ====");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil Data");
            System.out.println("3. ASC (Usia termuda ke tertua)");
            System.out.println("4. DSC (Usia tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih salah satu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (L=1/P=0)");
                    boolean jk =sc.nextInt() == 1;
                    System.out.print("Masukkan usia dosen: ");
                    int usia = sc.nextInt();

                    dosen07 dsn = new dosen07(kode, nama, jk, usia);
                    daftarDosen.tambah(dsn);
                    break;

                case 2:
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.ASC();
                    daftarDosen.tampil();
                    break;

                case 4:
                    daftarDosen.DSC();
                    daftarDosen.tampil();
                    break;

                case 5:
                    System.out.println("terima kasih");
                    break;
                
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        }while (pilihan !=5);
    }
}
