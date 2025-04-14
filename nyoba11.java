public class nyoba11 {
    nyoba01[] list;
    int idx;

    public nyoba11(int kapasitas){
        list = new nyoba01[kapasitas];
        idx=0;
    }

    public void tambah(nyoba01 m){
        if (idx < list.length){
            list[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    public void tampilSemua(){
        for(int i = 0; i < idx; i++){
            list[i].tampil();
        }
    }

    public void bubbleSortPeringkat(){
        for(int i=0; i<idx-1; i++){
            for(int j=0; j < idx-i-1; i++){
                if (list[j].peringkat>list[j+1].peringkat) {
                    nyoba01 temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public int binarySearchPeringkat(int cari){
        int left = 0, right = idx -1;
        while (left<=right) {
            int mid=(left+right)/2;
            if (list[mid].peringkat == cari) {
                return mid;
            }else if (list[mid].peringkat < cari) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

    public boolean nimSudahAda(String nim){
        for(int i =0; i<idx; i++){
            if (list[i].nim.equalsIgnoreCase(nim)) {
                return true;
            }
        }
        return false;
    }
}
