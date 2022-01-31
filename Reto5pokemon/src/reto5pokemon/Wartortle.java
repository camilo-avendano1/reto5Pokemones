
package reto5pokemon;

public final class Wartortle extends Pokemon {

    
    public Wartortle() {
    setNombre("Wartortle");
    setNivel(Byte.valueOf("2"));
    setSalud(102);
    }

    @Override
    public Blastoise evolucionar() {

        return new Blastoise();

    }

    @Override
    public void setNivel(byte nivel) {
        super.setNivel(nivel);  
    }

    @Override
    public byte getNivel() {
        return super.getNivel();  
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(salud);  
    }

    @Override
    public int getSalud() {
        return super.getSalud();  
    }

    @Override
    public void setGrito(String grito) {
        super.setGrito(grito);  
    }

    @Override
    public String getGrito() {
        return super.getGrito();  
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);  
    }

    @Override
    public String getNombre() {
        return super.getNombre();  
    }

    @Override
    public String gritar() {
        
        return "hiiiii i Wartortle!";
    }

}
