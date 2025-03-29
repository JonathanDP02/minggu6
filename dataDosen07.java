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

    public void PencarianDataSequential07(String nama){
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (dtDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Dosen ditemukan: ");
                dtDosen[i].tampil();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    public void PencarianDataBinary07(int usia){
        ASC();
        int left = 0, right = idx - 1;
        boolean found = false;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dtDosen[mid].usia == usia) {
                found = true;
                int i = mid;
                while (i >= 0 && dtDosen[i].usia == usia) {
                    dtDosen[i].tampil();
                    count++;
                    i--;
                }
                i = mid + 1;
                while (i < idx && dtDosen[i].usia == usia) {
                    dtDosen[i].tampil();
                    count++;
                    i++;
                }
                break;
            } else if (dtDosen[mid].usia > usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!found) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ada lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}
