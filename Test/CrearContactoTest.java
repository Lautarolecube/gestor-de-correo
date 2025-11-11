
package Test;
import org.junit.Assert; 

import org.junit.Test;

import main.Contacto;
import main.GestorContactos;

public class CrearContactoTest {
    
@Test
public void CrearContactoTest(){
    // Configurar el entorno de prueba
    GestorContactos listaContactos = new GestorContactos();

    Contacto contacto = new Contacto();
    contacto.setNombre("Lautaro Lopez Lecube");
    contacto.setEmail("lautarolecube@gmail.com");

    listaContactos.add(contacto);
    
   // Usa el método correcto: assertEquals
    Assert.assertEquals("Lautaro Lopez Lecube", contacto.getNombre());

    Assert.assertEquals( 1, listaContactos.tamañoLista());

    }


}