package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BandejaRecibidos {
    private List<Correo> correosRecibidos;

    public BandejaRecibidos() {
        this.correosRecibidos = new ArrayList<>();
    }

    public void agregarCorreo(Correo correo) {
        correosRecibidos.add(correo);
    }

    public List<Correo> getCorreos() {
        return correosRecibidos;
    }

    public List<Correo> buscarPorAsunto(String criterio){

        return correosRecibidos.stream()
                .filter(c -> c.getAsunto().toLowerCase().contains(criterio.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Correo> buscarPorRemitente(String criterio){

        return correosRecibidos.stream()
                .filter(c -> c.getRemitente().toLowerCase().contains(criterio.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Correo> buscarPorContenido(String criterio){

        return correosRecibidos.stream()
                .filter(c -> c.getContenido().toLowerCase().contains(criterio.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Correo> buscarPorContacto(String criterio){

        return correosRecibidos.stream()
                .filter(c -> c.getContacto().toLowerCase().contains(criterio.toLowerCase()))
                .collect(Collectors.toList());
    }


}