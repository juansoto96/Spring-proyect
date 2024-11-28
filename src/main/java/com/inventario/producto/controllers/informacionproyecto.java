package com.inventario.producto.controllers;
import java.time.LocalDateTime;

public class informacionproyecto {

    private LocalDateTime fechahoy;
    private String Nombreproyecto;

    public informacionproyecto(String Nombreproyecto, LocalDateTime fechahoy) {
        this.Nombreproyecto = Nombreproyecto;
        this.fechahoy = fechahoy;
    }

    public informacionproyecto() {
    }

    public LocalDateTime getFechahoy() {
        return fechahoy;
    }

    public String getNombreproyecto() {
        return Nombreproyecto;
    }

    public void setFechahoy(LocalDateTime fechahoy) {
        this.fechahoy = fechahoy;
    }

    public void setNombreproyecto(String Nombreproyecto) {
        this.Nombreproyecto = Nombreproyecto;
    }


    



}
