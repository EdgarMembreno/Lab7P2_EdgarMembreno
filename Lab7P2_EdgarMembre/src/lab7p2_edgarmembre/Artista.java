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
public class Artista {
    private String nombre;
    private String genero;
    private String disquera;
    private String alias;
    private String voz;

    public Artista() {
    }

    public Artista(String nombre, String genero, String disquera, String alias, String voz) {
        this.nombre = nombre;
        this.genero = genero;
        this.disquera = disquera;
        this.alias = alias;
        this.voz = voz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getVoz() {
        return voz;
    }

    public void setVoz(String voz) {
        this.voz = voz;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + ", disquera=" + disquera + ", alias=" + alias + ", voz=" + voz + '}';
    }
    
    
}
