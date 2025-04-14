import java.util.Scanner;

public class nyobaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nyoba11 data = new nyoba11(100);

        int pilih;

        do{
            System.out.println("==== Mahasiswa Lomba ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan semua");
            System.out.println("3. Urut bedasarkan peringkat");
            System.out.println("4. cari mahasiswa dengan peringkat");
            System.out.println("5. keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan NIM\t: ");
                    String nim = sc.nextLine();

                    if (data.nimSudahAda(nim)) {
                        System.out.println("NIM tersebut sudah ada! silahkan masukkan NIM yang berbeda");
                        break;
                    }

                    System.out.print("Masukkan Nama\t: ");
                    String nama=sc.nextLine();
                    System.out.println("Masukkan Kelas\t: ");
                    String kelas=sc.nextLine();

                    double ipk;
                    do{
                        System.out.print("Masukkan IPK\t: ");
                        ipk=sc.nextDouble();
                        if (ipk<0.0||ipk>4.0) {
                            System.out.println("IPK tidak valid");
                        }
                    }while(ipk<0.0||ipk>4.0);

                    System.out.print("Masukkan jenis lomba: ");
                    String lomba = sc.nextLine();
                    System.out.print("Masukkan peringkat: ");
                    int peringkat = sc.nextInt();

                    nyoba01 mhsBaru = new nyoba01(nim, nama, kelas, lomba, ipk, peringkat);
                    data.tambah(mhsBaru);
                    break;

                case 2:
                    data.tampilSemua();
                    break;

                case 3:
                    data.bubbleSortPeringkat();
                    System.out.println("Data telah diurutkan berdasarkan peringkat");
                    data.tampilSemua();
                    break;

                case 4:
                    System.out.print("Masukkan peringkat yang mau dicari: ");
                    int cari = sc.nextInt();
                    int hasil = data.binarySearchPeringkat(cari);
                    if (hasil != -1) {
                        System.out.println("Mahasiswa ditemukan");
                        data.list[hasil].tampil();
                    }else{
                        System.out.println("Mahasiswa tidak ada");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while (pilih != 4);
    }
}
