package sugeng.relasiclass.percobaan4;
public class Kursi {
    private String nomer;
    private Penumpang penumpang;

    
    public Kursi(String nomer) {
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
        
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomer: "+nomer+ "\n";
        if(this.penumpang != null){
            info += "Penumpang: "+ penumpang.info() + "\n";
        }
    
        return info;
    }
}
