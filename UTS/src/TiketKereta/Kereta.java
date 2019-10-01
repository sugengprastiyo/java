package TiketKereta;
public class Kereta {
    DaftarTketKrt Data[];
    int idx;
    
    void tambah (DaftarTketKrt d ){
        if (idx < Data.length){
            Data[idx] = d;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !! ");
        }
    }
    void tampil(){
        for (DaftarTketKrt d : Data){
            d.tampil();
            System.out.println("----------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<Data.length-1; i++){
            for (int j=1; j<Data.length-i; j++){
                if (Data[j].KuotatktKrt > Data[j-1].KuotatktKrt){
                    DaftarTketKrt tmp = Data[j];
                    Data[j] = Data [j-1];
                    Data[j-1] = tmp;
                }
            }
        }
    }
    public int sequentialSearch(int x){
        for (int i =0; i< Data.length; i++){
            if (Data[i].KuotatktKrt == x)
                return i;
        }
        return -1;
    }

    
    }

  
