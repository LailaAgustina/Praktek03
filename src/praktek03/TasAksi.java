package praktek03;
public class TasAksi {
    public static void main(String[] args) {
        Tas s = new Tas();
        
        s.setMerk("ZaraStore");
        s.setWarna("Biru");
        s.setBahan("Kulit");
        s.setModel("Selempang");
        s.setHarga(200000);
        //gak bisa s.setJenisTasSekolah();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Bahannya \t: ");
        System.out.println(s.getBahan());
        System.out.print("Modelnya \t: ");
        System.out.println(s.getModel());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        TasSekolah sm = new TasSekolah();
        sm.setMerk("Alexsa");
        sm.setWarna("Hijau");
        sm.setBahan("Beludru");
        sm.setModel("TasSekolah");
        sm.setHarga(2500000);
        sm.setJenisTasSekolah("TasRansel");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getJenisTasSekolah());
        sm.throttle();
    }
    
}
