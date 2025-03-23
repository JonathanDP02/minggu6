import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        mahasiswaBerprestasi07 list = new mahasiswaBerprestasi07(jumMhs);

        for (int i=0; i<jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" +(1+i)+ ": ");
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa07 mhs = new mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        // mahasiswa07 m1 = new mahasiswa07("123", "Zidan", "2A", 3.2);
        // mahasiswa07 m2 = new mahasiswa07("124", "Ayu", "2A", 3.5);
        // mahasiswa07 m3 = new mahasiswa07("125", "Sofi", "2A", 3.1);
        // mahasiswa07 m4 = new mahasiswa07("126", "Sita", "2A", 3.9);
        // mahasiswa07 m5 = new mahasiswa07("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
