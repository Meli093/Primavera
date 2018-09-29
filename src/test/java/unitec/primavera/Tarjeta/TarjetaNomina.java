package unitec.primavera.Tarjeta;
//las interfaces se puede meter muchos
public class TarjetaNomina extends tarjeta implements Pagos{

    @Override
    public void pagar() {
        System.out.println("pago Nomina");  
    
    }
    
}
