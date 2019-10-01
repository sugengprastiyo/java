package TUGAS;
public class Main {
    public static void main(String[] args) {
        Mac m = new Mac("Macbook Pro 2017", 4, 8, "Intel" , "lipo", "Mac Os");
        System.out.println("=======MAC=======");
        m.tampilMac();
        Windows w = new Windows("Asus", 4, 16, "Intel", "Lipo", "Microsoft");
        System.out.println("=======WINDOWS=======");
        w.tampilWindows();
        Pc p = new Pc("Lenovo", 2, 4, "Amd", 24);
        System.out.println("=======PC=======");
        p.tampilPc();
    }
}
