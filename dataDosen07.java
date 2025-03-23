public class dataDosen07 {
    dosen07 [] dtDosen = new dosen07[10];
    int idx = 0;

    public void tambah(dosen07 dsn){
        if (idx < dtDosen.length) {
            dtDosen[idx]=dsn;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    public void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
        }else{
            for(int i = 0; i < idx; i++){
                dtDosen[i].tampil();
            }
        }
    }

    public void ASC(){
        for(int i = 0; i < idx-1; i++){
            for(int j = 0; j < idx -1 -i; j++){
                if (dtDosen[j].usia > dtDosen[j+1].usia) {
                    dosen07 temp = dtDosen[j];
                    dtDosen[j] = dtDosen[j+1];
                    dtDosen[j+1]=temp;
                }
            }
        }
    }

    public void DSC(){
        for(int i = 1; i<idx; i++){
            dosen07 temp = dtDosen[i];
            int j=i-1;
            while (j >= 0 && dtDosen[j].usia<temp.usia) {
                dtDosen[j+1] = dtDosen[j];
                j--;
            }
            dtDosen[j+1]=temp;
        }
    }
}
