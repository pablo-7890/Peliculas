package co.edu.unisabana.peliculas.controller;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String nombrePelicula;
    private String fechaEstreno;
    private String empresa;


    public Pelicula(String nombrePelicula, String fechaEstreno, String empresa) {
        this.nombrePelicula = nombrePelicula;
        this.fechaEstreno = fechaEstreno;
        this.empresa = empresa;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
