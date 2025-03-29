public class mahasiswaBerprestasi07 {
    mahasiswa07[] listMhs;
    int idx;

    public mahasiswaBerprestasi07(){
    }

    public mahasiswaBerprestasi07(int jumlah){
        listMhs = new mahasiswa07[jumlah];
        idx =0;
    }

    public void tambah(mahasiswa07 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    public void tampil(){
        for(mahasiswa07 m:listMhs){
            m.tampilInformasi();
            System.out.println("......................");
        }
    }

    public void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    mahasiswa07 temp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=temp;
                }
            }
        }
    }

    public void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin=i;
            for(int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
        }
    }

    public void insertionSort(){
        for(int i=1; i<listMhs.length; i++){
            mahasiswa07 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    public int sequentialSearching(double cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t: " + listMhs[pos].nim);
            System.out.println("nama\t: " + listMhs[pos].nama);
            System.out.println("kelas\t: " + listMhs[pos].kelas);
            System.out.println("ipk\t: " + x);
        }
    }

    public int findBinarySearch(double cari, int left, int right){
        int mid;
        if(right>=left){
            mid=(left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, mid +1, right);
            }else{
                return findBinarySearch(cari, left, mid -1);
            }
        }
        return -1;
    }


}
