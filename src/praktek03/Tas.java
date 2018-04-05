package praktek03;

public class Tas {
  private String Merk;
  private String Warna;
  private String Bahan;
  private String Model;
  private double harga;
  
  void cetakInfo(){
      System.out.println("Merk \t: "+Merk+"\n"+
                         "Warna \t: "+Warna+"\n"+
                         "Bahan \t: "+Bahan+"\n"+ 
                         "Model \t: "+Model+"\n"+
                         "Harga \t: "+harga);
  }
}
