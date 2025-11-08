package main;

import java.util.ArrayList;
import java.util.List;

public class GestorContactos implements IEliminarContacto, ICrearContacto {

        //Atributos propios
        private List<Contacto> listaContactos;

        //Constructor vacío
        void BusquedaContacto(String nombre, String email){

        this.listaContactos = new ArrayList<>();

        }

        //Getters
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
        

        //Métodos
        public void BusquedaContacto(){

        this.listaContactos = new ArrayList<>();

        }

        public void agregarContacto(Contacto contacto){
            this.listaContactos.add(contacto);
        }



        public List<Contacto> buscarPorNombre(String criterio){

        List<Contacto> resultados = new ArrayList<>();

        String criterioLower = criterio.toLowerCase();

        for(Contacto contacto:listaContactos){
            //Buscamos al contacto por el nombre
            String nombreContacto = contacto.getNombre().toLowerCase();

            if(nombreContacto.contains(criterioLower)){
                resultados.add(contacto); //Si coincide lo agregamos a "resultados."
                }
            }}
        
        return resultados;
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

    
        
        //Metodos
        ListaContactos contactos = new ArrayList <ListaContactos>();

        for(ListaContactos contactos:ListaContactos){




        }

        





}
