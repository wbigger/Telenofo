public class TelefonoCellulare implements Telefono,Browser {
  
  final private double costoChiamata; 

  public TelefonoCellulare(double costoChiamata){
    this.costoChiamata = costoChiamata;
  }

  public double costoTelefonata(int durataChiamata){
    double costoChiamata = (double)durataChiamata * this.costoChiamata + 0.12;
    return costoChiamata;
  }

  @Override
  public void browse() {
    System.out.println("so andare su internet!");
  }

}