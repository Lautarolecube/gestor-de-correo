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


    //Getters
    public String getContacto() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setContacto(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public List<Contacto> listaDeContacto(){
        List<Contacto> resultados = new ArrayList<>();
        return resultados;
    }

    public static void editarNombre(Contacto contacto, String nuevoNombre){

        contacto.setNombre(nuevoNombre);

    }

    public static void editarMail(Contacto contacto, String nuevoEmail){

        contacto.setEmail(nuevoEmail);
    }

}