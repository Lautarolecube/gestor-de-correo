package main;

import java.util.List;

public class GestorContactos implements IEliminarContacto, ICrearContacto, IContacto {


        public String nombre;
        public String email;

        public GestorContactos(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
        
        void crearContacto(String nombre, String email){

            setvalidarNombre(nombre);
            validarEmail(email);

            this.nombre = nombre;
            this.email = email;

        }

        void validarEmail(String email){

            if (email == null) {

                throw new IllegalArgumentException("El campo email debe completarse");
         
            }
        }

        void validarNombre(String nombre){

            if (nombre == null) {

                throw new IllegalArgumentException("El campo nombre debe completarse");
         
            }
        }

        //getters
        public String getEmail() {
            return email;
        }

        String getNombre() {
            return nombre;
        }

        //setters
        void setEmail(String email) {
            this.email = email;
        }

        void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        
        <métodos para gestionar contactos>

        ListaContactos contactos;


}
