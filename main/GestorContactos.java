package main;

<<<<<<< HEAD
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
        
=======
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

>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10
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

<<<<<<< HEAD
    
        
        //Metodos
        ListaContactos contactos = new ArrayList <ListaContactos>();

        for(ListaContactos contactos:ListaContactos){




        }

        



=======
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
>>>>>>> f76f3723ff5fa2635ed3b6260ea6c0776cb2fb10


}
