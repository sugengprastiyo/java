package Tugas.relasiclass;
public class Admin {
    private String nAdmin;
    private int noAdmin;
    

    public Admin() {
    }

    public Admin(String nAdmin, int noAdmin) {
        this.nAdmin = nAdmin;
        this.noAdmin = noAdmin;
    }

    public String getnAdmin() {
        return nAdmin;
    }

    public void setnAdmin(String nAdmin) {
        this.nAdmin = nAdmin;
    }

    public int getNoAdmin() {
        return noAdmin;
    }

    public void setNoAdmin(int noAdmin) {
        this.noAdmin = noAdmin;
    }

   
    public void infoA(){
        System.out.println("Nama Admin: "+nAdmin);
    }
}
