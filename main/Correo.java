package main;

import java.util.ArrayList;
import java.util.List;

public class Correo implements ICorreo {

    private String asunto;
    private String contenido;
    private String remitente;
    private String contacto;
    private boolean importante;
    private String status;


    public Correo(String asunto, String contenido, String remitente, String contacto, boolean importante, String status) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.contacto = contacto;
        this.importante = importante;
        this.status = status;
    }
    
    //Getters
    public String getAsunto() {
        return asunto;
    }
    public String getContenido(){
        return contenido;
    }
    public String getRemitente() {
        return remitente ;
    }

    public String getStatus() {
        return status;
    }

    public String getContacto() {
        return contacto;
    }

    //Setters
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setRemitente(String remitente){
        this.remitente = remitente;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

     @Override
    public void marcarImportante() {
        this.importante = true;
    }

    @Override
    public boolean esImportante() {
        return importante;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void marcarLeido() {
        this.leido = true;
    }

    @Override
    public void marcarNoLeido() {
        this.leido = false;
    }



}