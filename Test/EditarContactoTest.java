package Test;

import org.junit.Assert;
import org.junit.Test;
import main.Contacto;
import main.GestorContactos;
import main.EditarContacto;

public class EditarContactoTest {

    @Test
    public void editarContactoTest() {
        // Configurar el entorno de prueba
        GestorContactos listaContactos = new GestorContactos();

        Contacto contactoOriginal = new Contacto();
        contactoOriginal.setNombre("Lautaro Lopez Lecube");
        contactoOriginal.setEmail("lautarolecube@gmail.com");

        listaContactos.add(contactoOriginal);

        // Editamos el nombre del contacto
        EditarContacto.editarNombre(contactoOriginal, "Lautaro Editado");

        // Verificamos el cambio
        Assert.assertEquals("El nombre del contacto no se editó correctamente",
                "Lautaro Editado", contactoOriginal.getNombre());
    }
}
