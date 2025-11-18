package main;

public interface ICorreo {

    void marcarImportante();

    boolean esImportante();

    String getStatus();

    void marcarLeido();

    void marcarNoLeido();
    
}
