package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorContactos {

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


        public List<Contacto> BuscarPorNombre(String criterio){

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


        public List<Contacto> eliminarContacto(String criterio){

        List<Contacto> eliminados = new ArrayList<>();
        String criterioLower = criterio.toLowerCase();
        
        Iterator<Contacto> itera = listaContactos.iterator();

        while(itera.hasNext()){
            Contacto contacto = itera.next();
            String emailLower = contacto.getEmail().toLowerCase();

            if(emailLower.contains(criterioLower)){
                eliminados.add(contacto);
                itera.remove();
            }
        }

        return eliminados;
    }



        public void crearContacto(String nombre, String email){

        Contacto contacto = new Contacto(nombre, email);
        
        this.add(contacto);

        }

    }

