package main;

import java.util.ArrayList;
import java.util.List;

public class GestorContactos implements IEliminarContacto, ICrearContacto {

        //Atributos propios
        private List<Contacto> listaContactos = new ArrayList<>();

          //Constructor vacío
        public GestorContactos(){

        }

        //Métodos
        public void add(Contacto contacto){
            this.listaContactos.add(contacto);
        }

        public int tamañoLista(){
            return this.listaContactos.size();
        }

        public void BusquedaContacto(){

        this.listaContactos = new ArrayList<>();

        }

        //Getters
        public String getEmail(String email) {
            return email;
        }

        String getNombre(String nombre) {
            return nombre;
        }

        //setters
        void setEmail(String email) {
            this.email = email;
        }

        void setNombre(String nombre) {
            this.nombre = nombre;
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
            }
        
        return resultados;
        }
        
    }

