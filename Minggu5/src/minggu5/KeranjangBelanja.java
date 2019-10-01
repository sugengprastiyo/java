package minggu5;
public class KeranjangBelanja {
   Barang[]listBarang = new Barang[4];
   int idx;
    
   void tambah(Barang brg){
      if (idx<listBarang.length){
            listBarang[idx] = brg;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !! ");
        }
   }
   
   void tampil(){
        for (Barang brg : listBarang){
            brg.tampil();
            System.out.println("----------------------------------------");
        }
   }
   void bubbleSort(){
        for (int i=0; i<listBarang.length-1; i++){
            for (int j=1; j<listBarang.length-i; j++){
                if (listBarang [j].hargasatuan < listBarang[j-1].hargasatuan){
                    Barang tmp = listBarang[j];
                    listBarang[j] = listBarang [j-1];
                    listBarang[j-1] = tmp;
                }
            }
        }
    }
   void selectionSort(){
        for (int i=0;i<listBarang.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j<listBarang.length; j++){
                if (listBarang[j].hitungHargaTotal()<listBarang[idxMin].hitungHargaTotal()){
                    idxMin = j;
                }
            }
            Barang tmp = listBarang[idxMin];
            listBarang [idxMin] = listBarang[i];
            listBarang[i] = tmp;
        }
    }
   void mergeSort (int a, int b){
       int idxFirst = a;
       int idxLast = b;
       if (idxFirst >= idxLast){
           return;
       }
       int idxMiddle = (idxFirst+idxLast)/2;
       mergeSort (idxFirst, idxMiddle);
       mergeSort (idxMiddle+1, idxLast);
       while ((a<= idxMiddle) && (idxMiddle+1 <= idxLast)){
           if (listBarang[idxFirst].jumlah < listBarang[idxMiddle+1].jumlah){
               idxFirst++;
           }else{
               Barang tmp = listBarang[idxMiddle+1];
               for (int o=idxMiddle+1 -1; o>=idxFirst; o--){
                   listBarang[o+1]=listBarang[o];
               }
               listBarang [idxFirst]=tmp;
               idxFirst++;
               idxMiddle++;
               int brg = idxMiddle+1;
               brg++;
           }
       }
   }
   
   }
