package main;

import java.util.List;

public class Correo implements ICorreo {

    private String asunto;
    private String contenido;
    private String remitente;
    private List <String> contactos;
    private String status;
    private boolean importante;
    private String contacto;


    public Correo(String asunto, String contenido, String remitente, List<String> contactos, String status, boolean importante, String contacto) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.contactos = contactos;
        this.status = "pending";
        this.contacto = contacto;
    }
    
    //Getters
    public String getAsunto() {
        return asunto;
    }
    public String getContent(){
        return contenido;
    }
    public String getRemitente() {
        return remitente ;
    }
    public List<String> getcontactos() {
        return contactos;
    }
    public String getStatus() {
        return status;
    }

    public List<String> getContacto() {
        return contactos;
    }

    //Setters
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setContent(String contenido) {
        this.contenido = contenido;

    public void setRemitente(String remitente){
        this.remitente = remitente;
    }

    public void setcontactos(List<String> contactos) {
        this.contactos = contactos;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


    }
}