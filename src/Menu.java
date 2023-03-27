import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Menu {

    /**
     * Atributos de la clase Menú
     */

    private String selector; //Nos permite guardar la seleccion del usuario.

    /**
     * Métodos para generar fichero Menu y leerlo.
     */

    public void generarMenu () {
        Scanner memoria = new Scanner(System.in);
        System.out.println("Si deseas generar un nuevo menu, escribe: SI de lo contrario escribe NO");
        selector = memoria.nextLine();

        if(selector.equalsIgnoreCase("SI")) {
            try {
                FileWriter guardarMenu = new FileWriter("menu.txt");
                //Creamos los objetos correspondienetes a cada plato para escribirlos en el archivo.
                Entrante entrante = new Entrante();
                Primero primero = new Primero();
                Segundo segundo = new Segundo();
                Postre postre = new Postre();
                //Invocamos al metodo getPlatoAleatorio para generarlo dentro de la memoria.
                guardarMenu.write(entrante.getPlatoAleatorio());
                guardarMenu.write(" ");
                guardarMenu.write(primero.getPlatoAleatorio());
                guardarMenu.write(" ");
                guardarMenu.write(segundo.getPlatoAleatorio());
                guardarMenu.write(" ");
                guardarMenu.write(postre.getPlatoAleatorio());
                guardarMenu.close();
            } catch (IOException e) {
                System.out.println("Ha habido un error");
            }
        }if(selector.equalsIgnoreCase("NO")){
            System.out.println("Has decidido no generar ningún menú nuevo");
        }
    }


    public void leerMenu(){
        if(selector.equalsIgnoreCase("SI")) {
            System.out.println("El menú que se ha generado aleatoriamente es: ");
            try {
                FileReader lectorMenu = new FileReader("menu.txt");
                int c = lectorMenu.read();

                while (c != -1) {
                    c = lectorMenu.read(); //.read nos devuelve enteros.
                    char convertirEnLetra = (char) c; //Hacemos un casting de los enteros a caracteres para poder leer el fichero.
                    System.out.print(convertirEnLetra); //mostramos en pantalla el mensaje.
                }
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error");
            }
        }if(selector.equalsIgnoreCase("NO")){
            System.out.println("Genera un nuevo menú para mostralo");
        }
    }
}
