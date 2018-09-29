package unitec.primavera.Tarjeta;
//las interfaces se puede meter muchos
public class TarjetaDebito extends tarjeta implements Pagos{

    @Override
    public void pagar() {
        System.out.println("pagando debito");  
    
    }
    
}
