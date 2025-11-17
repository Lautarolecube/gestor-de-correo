package main;

import java.util.ArrayList;
import java.util.List;


public class EditarContacto {

    protected GestorContactos gestor;
    protected String email;
    protected String nombre;
   
    //Constructor vacío
    public EditarContacto() {

    }

    public static void editarNombre(Contacto contacto, String nuevoNombre){

        contacto.setNombre(nuevoNombre);

    }

    public static void editarMail(Contacto contacto, String nuevoEmail){

        contacto.setEmail(nuevoEmail);
    }

}