public class dosen07 {
    String kode;
    String nama;
    boolean jenisKel;
    int usia;

    public dosen07(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKel = jk;
        usia = age;
    }

    public void tampil(){
        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Jenis kelamin\t: " + (jenisKel ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia\t: " + usia + "tahun");
        System.out.println("-----------------------------------");
    }
}
