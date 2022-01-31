
package reto5pokemon;

public final class Charmander extends Pokemon {

    public Charmander() {
        setNombre("Charmander");
        setNivel(Byte.valueOf("1"));
        setSalud(44);
    }

    @Override
    public Charmaleon evolucionar() {
        System.out.println("su personaje ha evolucionado");
        return new Charmaleon();
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
        return "I'm CharmanderGOD, Fight?";
    }
}
