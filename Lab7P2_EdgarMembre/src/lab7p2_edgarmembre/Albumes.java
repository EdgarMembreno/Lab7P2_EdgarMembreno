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
public class Albumes {
    private String nombre;
    private String fecha;
    private String genero;
    private String formato;
    private String alias;
    private String lista;

    public Albumes() {
    }
    
    
    

    public Albumes(String nombre, String fecha, String genero, String formato, String alias, String lista) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.genero = genero;
        this.formato = formato;
        this.alias = alias;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
