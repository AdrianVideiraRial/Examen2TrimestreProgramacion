public class Postre extends Plato{

    /**
     * Atributos.
     * Definimos la carta de postres.
     */

    private String postre1 = "Postre: Flan";
    private String postre2 = "Postre: Natillas";
    private String postre3 = "Postre: Tarta de la casa";
    private String postre4 = "Postre: Brownie de chocolate";

    /**
     * Metodo para establece el plato de forma aleatoria.
     */

    @Override
    public String getPlatoAleatorio () {
        String postre = "";
        int platoSeleccionado = (int) (Math.random()*4);

        switch (platoSeleccionado){
            case 0:
                postre = postre1;
                break;
            case 1:
                postre = postre2;
                break;
            case 2:
                postre = postre3;
                break;
            case 3:
                postre = postre4;
                break;
            default:
                System.out.println("Ha habido un error");
        }
        //System.out.println(platoSeleccionado);
        //System.out.println(postre);
        return postre;
    }
}
