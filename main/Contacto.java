package main;

public class Contacto {

    //Atributos propios
    private String nombre;
    private String email;

    //Constructor con parámetros
    public Contacto(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    //Constructor vacío
    public Contacto(){
        
    }
    
    //Métodos
    public void validarEmail(String email){

            if (email == null) {

                throw new IllegalArgumentException("El campo email debe completarse");
         
            }
        }

    public void validarNombre(String nombre){

            if (nombre == null) {

                throw new IllegalArgumentException("El campo nombre debe completarse");
         
            }
        }

    //getters
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    //setters
    public void setEmail(String email) {
            this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContacto'");
    }
    
    
}
