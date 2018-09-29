package unitec.primavera.Tarjeta;
//las interfaces se puede meter muchos
public class TarjetaCredito extends tarjeta implements Pagos{

    @Override
    public void pagar() {
        System.out.println("pagando Credito");  
    
    }
    
}
