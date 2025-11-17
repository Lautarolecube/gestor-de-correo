package Test;
import static org.junit.Assert.*;

import org.junit.Assert; 

import org.junit.Test;

import main.Contacto;
import main.EditarContacto;
import main.GestorContactos;

public class EliminarContactoTest {


    @Test
    public void eliminarContactoTest(){

        GestorContactos listaContactos = new GestorContactos();
        
        Contacto contactoOriginal = new Contacto("Lautaro Lopez Lecube", "lautarolecube@");
        listaContactos.add(contactoOriginal);

        listaContactos.eliminarContacto(contactoOriginal.getEmail());
        
        Assert.assertEquals(0, listaContactos.tamañoLista());
        Assert.assertNotEquals(listaContactos, contactoOriginal);
    }

    @Test
    public void editarContactoTest() {
        // Configurar el entorno de prueba
        GestorContactos listaContactos = new GestorContactos();

        Contacto contactoOriginal = new Contacto("Lautaro Lopez Lecube", "lautarolecube@gmail.com");
 
        listaContactos.add(contactoOriginal);

        // Editamos el nombre del contacto
        EditarContacto.editarNombre(contactoOriginal, "Lautaro Editado");

        // Verificamos el cambio
        Assert.assertEquals("El nombre del contacto no se editó correctamente",
                "Lautaro Editado", contactoOriginal.getNombre());
    }
}
