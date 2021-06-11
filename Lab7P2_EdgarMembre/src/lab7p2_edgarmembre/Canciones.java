/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_edgarmembre;

/**
 *
 * @author edgarmembreno
 */
public class Canciones {
    private String nombre;
    private int duracion;
    private String compositor;
    private String distribuidor;
    private String exlusivs;
    private String productor;

    public Canciones() {
    }

    public Canciones(String nombre, int duracion, String compositor, String distribuidor, String exlusivs, String productor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.compositor = compositor;
        this.distribuidor = distribuidor;
        this.exlusivs = exlusivs;
        this.productor = productor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getExlusivs() {
        return exlusivs;
    }

    public void setExlusivs(String exlusivs) {
        this.exlusivs = exlusivs;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", duracion=" + duracion + ", compositor=" + compositor + ", distribuidor=" + distribuidor + ", exlusivs=" + exlusivs + ", productor=" + productor + '}';
    }
    
    
}
