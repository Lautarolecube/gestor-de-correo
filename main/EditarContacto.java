package main;

public abstract class EditarContacto {

    //Atributos
    private String nombre;
    private String email;


    //Constructor vacío
    public EditarContacto() {
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public abstract void editarContacto();


}