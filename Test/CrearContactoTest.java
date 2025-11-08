package Test;
import org.junit.Assert; 

import org.junit.Test;

import main.Contacto;


public class CrearContactoTest {
    

@Test
public void CrearContactoTest() {
    // Configurar el entorno de prueba
    Contacto contacto = new Contacto();
    contacto.setNombre("Lautaro Lopez Lecube");
    contacto.setEmail("lautarolecube@gmail.com");
    
   // Usa el método correcto: assertEquals
    Assert.assertEquals("Lautaro Lopez Lecube", contacto.getNombre());
    }

}
