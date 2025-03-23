public class mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa07(){
    }

    public mahasiswa07(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas );
        System.out.println("IPK : " + ipk);
    }
}
