package main;

import java.util.List;

public class Correo implements ISchedule, CorreoSpam , ISend , ICrearContacto , IInboxReceiver{

    private String subject;
    private String content;
    private String sender;
    private String contacto;
    private List <String> recipients;
    private String status;
    private String fecha;
    
    public Correo(String subject, String content, String sender, List<String> recipients, String fecha, String contacto) {
        this.subject = subject;
        this.content = content;
        this.sender = sender;
        this.recipients = recipients;
        this.status = "pending";
        this.fecha = fecha;
    }
    
    //getters
    public String getSubject() {
        return subject;
    }
    public String getContent() {
        return content;
    }
    public String getSender() {
        return sender;
    }
    public List<String> getRecipients() {
        return recipients;
    }
    public String getStatus() {
        return status;
    }

    public String getFecha() {
        return fecha;
    }

    public String getContacto() {
        return contacto;
    }

    //setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


}
