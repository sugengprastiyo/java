package minggu5;
public class DaftarMahasiswaBerprestasi {
    Mahasiswa ListMhs[] = new Mahasiswa [5];
    int idx;
    
    void tambah (Mahasiswa m){
        if (idx<ListMhs.length){
            ListMhs[idx] = m;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !! ");
        }
    }
    void tampil (){
        for (Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("----------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<ListMhs.length-1; i++){
            for (int j=1; j<ListMhs.length-i; j++){
                if (ListMhs [j].ipk > ListMhs[j-1].ipk){
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs [j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i=0;i<ListMhs.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<ListMhs.length; j++){
                if (ListMhs[j].ipk<ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = ListMhs[idxMin];
            ListMhs [idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertionSort(){
        
        int j;
        for (int i=1; i< ListMhs.length-1;i++){
        double key = ListMhs[i].ipk;  
            key =  ListMhs[i].ipk;
            j = i-1;
        while ( j>=0 && ListMhs[j].ipk > key){
            ListMhs[j+1].ipk = ListMhs[j].ipk;
            j--;
        }
        ListMhs[j+1].ipk=key;
    }
}
}
