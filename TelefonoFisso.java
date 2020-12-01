public class TelefonoFisso implements Telefono {

  final private double costoChiamata; 
  
  public TelefonoFisso(double costoChiamata) {
    this.costoChiamata = costoChiamata;
  }

  @Override
  public double costoTelefonata(int durataChiamata) {
    double costoChiamata = durataChiamata * this.costoChiamata;
    return costoChiamata;
  }

}