package main;

public class Contacto {

    //Atributos propios
    private String nombre;
    private String email;

    //Constructor con parámetros
    public Contacto(String nombre, String email) {
        validarEmail(email);
        validarNombre(nombre);
        this.nombre = nombre;
        this.email = email;
    }
    
    //Métodos
    public void validarEmail(String email){

            if (email == null && email.isEmpty() && email.contains("@")) {

                throw new IllegalArgumentException("El campo email debe completarse");
         
            }
        }

    public void validarNombre(String nombre){

            if (nombre == null && nombre.isEmpty()) {

                throw new IllegalArgumentException("El campo nombre debe completarse");
         
            }
        }

    //Getters
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setEmail(String email) {
            this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
}
