<<<<<<< HEAD
package Test;
import org.junit.Assert; 

import org.junit.Test;

import main.Contacto;

=======
package main;
>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10

public class CrearContactoTest {
    

<<<<<<< HEAD
@Test
public void CrearContactoTest() {
    // Configurar el entorno de prueba
    Contacto contacto = new Contacto();
    contacto.setNombre("Lautaro Lopez Lecube");
    contacto.setEmail("lautarolecube@gmail.com");
    
   // Usa el método correcto: assertEquals
    Assert.assertEquals("Lautaro Lopez Lecube", contacto.getNombre());
=======
    @Test
    public void testCrearContacto() {
        // Configurar el entorno de prueba
        Contactos gestor = new Contactos();
        String nombre = "Juan Perez";
        String email = "";
>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10
    }

}
