
package reto5pokemon;

public final class Raichu extends Pokemon {

    public Raichu() {
        setNombre("Raichu");
        setNivel(Byte.valueOf("3"));
        setSalud(222);
    }

    @Override
    public String gritar() {
        return "i am Raichu, my dear friend! potatoes?";
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
    public Pokemon evolucionar() throws NoEvolucionaException {

        throw new NoEvolucionaException();

    }
}
