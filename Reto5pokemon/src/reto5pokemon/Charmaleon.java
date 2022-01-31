
package reto5pokemon;

public final class Charmaleon extends Pokemon {

    public Charmaleon() {
    setNombre("Charmaleon");
    setNivel(Byte.valueOf("2"));
    setSalud(232);
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

        return "i'm Charmaleon, your daddy >:v " ;
    }

    @Override
    public Charizard evolucionar() {
        return new Charizard();
    }

}
