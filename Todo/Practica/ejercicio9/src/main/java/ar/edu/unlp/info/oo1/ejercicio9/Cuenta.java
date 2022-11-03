package ar.edu.unlp.info.oo1.ejercicio9;

public abstract class Cuenta {
   private double saldo;


   public Cuenta() {
       this.saldo=0;
   }


  public double getSaldo() {
      return saldo;
  }

  public void depositar(double monto) {
      this.saldo += monto;
  }

  public void extraerSinControlar(double monto) {
      if(this.puedeExtraer(monto)) {
          this.extraerSinControlar(monto);
          cuentaDestino.depositar(monto);
          return true;
      }
      return false;
  }


  public abstract boolean puedeExtraer();


}
