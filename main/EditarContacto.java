package main;

public abstract class EditarContacto {

<<<<<<< HEAD
    //Atributos
    private String nombre;
    private String email;


    //Constructor vacío
    public EditarContacto() {
    }

    //Getters
=======
    private String nombre;
    private String email;

    public EditarContacto() {
    }

    public abstract void editarContacto();

>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10
    public String getNombre() {
        return nombre;
    }

<<<<<<< HEAD
=======
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public abstract void editarContacto();


=======
    public void setEmail(String email) {
        this.email = email;
    }
>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10
}