
package reto5pokemon;

public final class Pikachu extends Pokemon {

    public Pikachu() {
    setNombre("Pikachu");
    setNivel(Byte.valueOf("2"));
    setSalud(68);
    }

    @Override
    public String gritar() {
        return "I am Pikachu, pika pika!";
    }

    @Override
    public Raichu evolucionar() {
        System.out.println("su personaje ha evolucionado");
        return new Raichu();
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
 
}
