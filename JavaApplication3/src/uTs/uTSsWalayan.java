package uTs;
public class uTSsWalayan {
    utsC3 ListBarang[];
    int idx;
    
    void tambah (utsC3 u){
        if (idx<ListBarang.length){
            ListBarang[idx] = u;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !! ");
        }
    }
    void tampil (){
        for (utsC3 u : ListBarang){
            u.tampil();
            System.out.println("----------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<ListBarang.length-1; i++){
            for (int j=1; j<ListBarang.length-i; j++){
                if (ListBarang[j].StokBdgd > ListBarang[j-1].StokBdgd){
                    utsC3 tmp = ListBarang[j];
                    ListBarang[j] = ListBarang [j-1];
                    ListBarang[j-1] = tmp;
                }
            }
        }
    }
    public int sequentialSearch(int x){
        for (int i =0; i< ListBarang.length; i++){
            if (ListBarang[i].kodeB == x)
                return i;
        }
        return -1;
    }
}
