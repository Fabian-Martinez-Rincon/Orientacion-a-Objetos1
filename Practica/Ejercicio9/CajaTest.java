public class CajaTest {
    public static void main(String[] args) {
            
            CajaDeAhorro caja = new CajaDeAhorro(100);
            caja.extraer(50);
            System.out.println(caja.getSaldo());
            
            CuentaCorriente cuenta = new CuentaCorriente(200,25);
            cuenta.extraer(225);
            System.out.println(cuenta.getSaldo());
            
            caja.depositar(100);
            caja.transferirACuenta(50, cuenta);

            System.out.println(caja.getSaldo());
            System.out.println(cuenta.getSaldo());
        }

    
}