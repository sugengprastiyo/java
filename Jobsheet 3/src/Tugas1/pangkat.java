package Tugas1;
public class pangkat {
     int x;
     int n;
    
    public void pangkatBruteForce(){
        int hasil = 1;
        for (int i=1; i<=n;i++){
           hasil = hasil*x;
        }
        System.out.println("Hasil Brute Force =  "+hasil);
    }
    public int  pangkatDivideConquer( int a, int angka){
        int hasil = 1;
        n=a;
        x = angka;
        if (a==1){
            return angka;
        }
        else if (a== 0){
            return 1;
        }else if (a %2 == 0){
            return (pangkatDivideConquer(a/2, angka)*pangkatDivideConquer(a/2, angka));
                    }else{
            return (pangkatDivideConquer(a/2, angka)*(pangkatDivideConquer(a/2, angka)*angka));
        }
        }
    }
