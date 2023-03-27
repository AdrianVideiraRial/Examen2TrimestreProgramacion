import org.w3c.dom.ls.LSOutput;

public class Plato {
    /**
     * Atributos.
     * En nuestro caso serán diferentes platos a seleccionar.
     */

    String plato1;
    String plato2;
    String plato3;
    String plato4;

    /**
     * Metodo para establece el plato de forma aleatoria.
     */

    public String getPlatoAleatorio () {
        String plato = "";
        int platoSeleccionado = (int) (Math.random()*4);

        switch (platoSeleccionado){
            case 0:
                plato = plato1;
                break;
            case 1:
               plato = plato2;
                break;
            case 2:
                plato = plato3;
                break;
            case 3:
                plato = plato4;
                break;
            default:
                System.out.println("Ha habido un error");
        }
        //System.out.println(platoSeleccionado);
        //System.out.println(plato);
        return plato;

    }


}
