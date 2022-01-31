package reto5pokemon;

import java.util.InputMismatchException;

public class Reto5pokemon {

    public static void main(String[] args) throws NoEvolucionaException {
        try {
            Utileria tool = new Utileria();
            int opcion = -1;
            Pokebola pokebolas = new Pokebola();

            while (opcion != 0) {

                opcion = tool.ingresoInt("\n\n!!!BIENVENIDO!!!!!!\n\n\n"
                 + "INGRESE UNA OPCIÓN DEL MENÚ:\n\n"
                 + "1) REGISTRAR POKEMON.\n"
                 + "2) MOSTRAR MIS POKEMONES.\n"
                 + "3) EVOLUCIONAR POKEMON\n"
                 + "4) ESTADISTICAS POKEMON\n"
                 + "0) SALIR\n");

                switch (opcion) {
                    case 1:
                        pokebolas.crear();
                        break;
                    case 2:
                        pokebolas.mostrar();
                        break;
                    case 3:
                        try {
                            pokebolas.mostrar();

                            int index = tool.ingresoInt("¿CUÁL POKEMON DESEAS EVOLUCIONAR?(INGRESE EL NÚMERO): ") - 1;
                            try {
                                pokebolas.pokebolas.get(index).setPokemonAlmacenado(pokebolas.pokebolas.get(index).pokemonAlmacenado.evolucionar());
                            } catch (NoEvolucionaException e) {
                                System.out.println("Este pokemon no puede evolucionar màs.");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Ingrese un valor correcto por favor ");
                        }
                        break;
                    case 4:
                        pokebolas.mostrar();

                        int aux = tool.ingresoInt("¿CUÁL POKEMON DESEAS CONOCER?(INGRESE EL NÚMERO): ") - 1;
                        try {
                            System.out.println(pokebolas.pokebolas.get(aux).getPokemonAlmacenado().toString());
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Ingrese un valor correcto por favor ");
                        }
                        break;
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("Ingrese una opción númerica de la lista. :) ");
        }
    }
}
