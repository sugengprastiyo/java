package mahasiswa;
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println("__________________");
        mhs2.nim=102;
        mhs2.nama="Bejo";
        mhs2.alamat="Jl. Garuda No 22";
        mhs2.kelas="1A";
        mhs2.tampilBiodata();
        System.out.println("__________________");
        mhs3.nim=103;
        mhs3.nama="Andy";
        mhs3.alamat="Jl. Merdeka No 4A";
        mhs3.kelas="1A";
        mhs3.tampilBiodata();
    }
}
