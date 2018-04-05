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

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getBahan() {
        return Bahan;
    }

    public void setBahan(String Bahan) {
        this.Bahan = Bahan;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
  
  
}
