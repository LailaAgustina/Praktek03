package praktek03;

public class TasSekolah extends Tas{
    private String JenisTasSekolah;

    void throttle(){
        System.out.println("Buku,Pensil,Pulpen,Penggaris,penghapus");
    }

    public String getJenisTasSekolah() {
        return JenisTasSekolah;
    }

    public void setJenisTasSekolah(String JenisTasSekolah) {
        this.JenisTasSekolah = JenisTasSekolah;
    }
    
    
}
