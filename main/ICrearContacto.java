package main;

public interface ICrearContacto {

    @Override
    public void crearContacto() {
    
        // Lógica para crear un contacto
        setNombreContacto();
        setEmailContacto();
        guardarContacto();

    }

    

}
