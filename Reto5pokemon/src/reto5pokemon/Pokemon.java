
package reto5pokemon;

public abstract class Pokemon {
    private String nombre = "pokemon";
    private String grito = "soy un pokemon";
    private int salud = 0;
    private byte nivel = 0;

    
    public abstract Pokemon evolucionar() throws NoEvolucionaException;

    public String gritar(){
        return this.grito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", grito=" + gritar() + ", salud=" + salud + ", nivel=" + nivel ;
    }
    
    
    

}
