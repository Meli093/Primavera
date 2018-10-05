package unitec.primavera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{
         // @Autowired RepositorioPagos repoPagos;;
	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
	}
    public void run(String... args) throws Exception {
        System.out.println("Hola");
        //RepositoriosPagos.servicioPagar();
    }
}
