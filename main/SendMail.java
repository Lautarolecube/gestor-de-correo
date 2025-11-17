package main;

import java.util.List;

//Clase que implementa la interfaz ISend para enviar correos electrónicos.
public class SendMail implements ISend {
    private String asunto;
    private String contenido;
    private String remitente;
    private List<String> recipients;
    private boolean important;
    private String status;

    // Constructor
    public SendMail(String asunto, String contenido, String remitente, List<String> recipients, boolean important, String status) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.remitente = remitente;
        this.recipients = recipients;
        this.important = false;
        this.status = "pending";
    }


    //Info del correo
    @Override
    public String[] getEmailInfo() {
        return new String[]{asunto, contenido, remitente, String.join(", ", recipients)};
    }

    // Envía el correo electrónico.
    @Override
    public void send() {
        // Simula el envío
        status = "sent";
    }

    // Marca el correo como importante.
    @Override
    public void markImportant() {
        important = true;
    }

    // Devuelve el estado del envío (por ejemplo, "Enviado", "Error").
    @Override
    public String getStatus() {
        return status;
    }

    // Getters para tests o uso externo
    public String getSubject() { return asunto; }
    public String getContent() { return contenido; }
    public String getSender() { return remitente; }
    public List<String> getRecipients() { return recipients; }
    public boolean isImportant() { return important; }
}
