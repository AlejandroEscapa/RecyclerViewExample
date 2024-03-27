package es.master.p9_recyclerview;

import android.graphics.Color;
import android.widget.ImageView;

import androidx.annotation.NonNull;

public class Vehiculo {

    String nombre;
    int precio, resourceId, resourceColor;
    public Vehiculo(String nombre, int precio, int resourceId, int resourceColor) {
        this.nombre = nombre;
        this.precio = precio;
        this.resourceId = resourceId;
        this.resourceColor = resourceColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceColor() {
        return resourceColor;
    }

    public void setResourceColor(int resourceColor) {
        this.resourceColor = resourceColor;
    }

    public String mostrarInfo() {
        return "El nombre es: " + nombre + ", el precio es de: " + precio + ".";
    }
}
