
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
    String nombre = "Lautaro Lopez Lecube";
    String email = "lautarolecube@gmail.com";

    Contacto contacto = new Contacto(nombre, email);

    listaContactos.add(contacto);
    
   // Usa el método correcto: assertEquals
    Assert.assertEquals(nombre, contacto.getNombre());
    Assert.assertEquals(email, contacto.getEmail());
    Assert.assertEquals( 1, listaContactos.tamañoLista());

    }
    
}