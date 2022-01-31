
package reto5pokemon;

import java.util.ArrayList;

public class Pokebola {

    ArrayList<Pokebola> pokebolas = new ArrayList();
    String tamanoPokebola;
    Pokemon pokemonAlmacenado;

    public Pokebola() { //constructor vacio
        this.tamanoPokebola = "vacia";
        this.pokemonAlmacenado = null;
    }

    public void atrapar(Pokebola pokemon) {
        pokebolas.add(pokemon);
    }

    public void crear() {
        Pokemon pokemon;
        Pokebola pokeball = new Pokebola();
        int opcion;
        Utileria tool = new Utileria();
        opcion = tool.ingresoInt("\n\n DESEA CREAR: \n\n"
         + "1) CHARMANDER.\n"
         + "2) PIKACHU. \n"
         + "3) SQUIRTLE. \n");
        switch (opcion) {
            case 1:

                pokemon = new Charmander();
                System.out.println("Creaste tu " + pokemon.getNombre() + "\n");
                break;

            case 2:
                pokemon = new Pikachu();
                System.out.println("Creaste tu " + pokemon.getNombre() + "\n");
                break;

            case 3:
                pokemon = new Squirtle();
                System.out.println("Creaste tu " + pokemon.getNombre() + "\n");
                break;

            case 9:
                System.out.println("Regresaste al menú ppal.");
                pokemon = null;
                break;

            default:
                System.out.println("Ingresa por favor una opción valida");
                pokemon = null;
                break;

        }
        opcion = tool.ingresoInt("¿DESEAS CAPTURAR TU NUEVO POKEMON EN UNA POKEBOLA DE QUE TAMAÑO?: \n"
         + "1) PEQUEÑA.\n"
         + "2) MEDIANA.\n"
         + "3) GRANDE. \n");
        switch (opcion) {
            case 1:
                pokeball.setTamanoPokebola("Pequeña.");
                break;
            case 2:
                pokeball.setTamanoPokebola("Mediana.");
                break;
            case 3:
                pokeball.setTamanoPokebola("Grande.");
                break;
            default:
                System.out.println("Ingrese un tamaño correcto.");
                break;
        }
        
        pokeball.setPokemonAlmacenado(pokemon);
        pokebolas.add(pokeball);
    }
    

    public ArrayList<Pokebola> getPokebolas() {
        return pokebolas;
    }

    public void setPokebolas(ArrayList<Pokebola> pokebolas) {
        this.pokebolas = pokebolas;
    }

    public String getTamanoPokebola() {
        return tamanoPokebola;
    }

    public void setTamanoPokebola(String tamanoPokebola) {
        this.tamanoPokebola = tamanoPokebola;
    }

    public Pokemon getPokemonAlmacenado() {
        return pokemonAlmacenado;
    }

    public void setPokemonAlmacenado(Pokemon pokemonAlmacenado) {
        this.pokemonAlmacenado = pokemonAlmacenado;
    }

    public void mostrar() {
    for(int i=0; i<pokebolas.size();i++){
        System.out.println((i+1)+")"+pokebolas.get(i).getPokemonAlmacenado().getNombre() + " en bola "+ pokebolas.get(i).getTamanoPokebola() );
    }
    }

}
