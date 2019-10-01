package Tugas2;
public class MatriksHitungBF {
    static int arrHasil[][] = new int [4][4];
     static int arr1 [][] = new int [4][4];
     static int arr2 [][] = new int [4][4];
    MatriksMain matriks = new MatriksMain();
    
    public void HitungMatriksBF(){    
        for (int i = 0; i<4;i++){
            for (int j = 0; j<4;j++){
                int hasil = 0;
                for (int b = 0; b<4;b++){
                    hasil = hasil +arr1[i][b] *arr2[b][j];
                }
                arrHasil[i][j] = hasil;
            }
        }
    }
    public void TampilHasil(){
        System.out.println("Hasil Perkalian Dengan BF"); 
         for (int i = 0; i<4;i++){
            for (int j = 0; j<4;j++){
                System.out.print(arrHasil[i][j]+"\t");
       
    }
             System.out.println(" ");
     }
    }
}
