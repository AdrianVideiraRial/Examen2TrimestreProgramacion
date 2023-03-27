public class Entrante extends Plato{

    /**
     * Atributos.
     * Definimos los entratnes a seleccionar.
     */

    private String entrante1 = " Entrante: Sopa /" ;
    private String entrante2 = " Entrante: Ensalada /";
    private String entrante3 = " Entrante: Gyozas /";
    private String entratne4 = " Entrante: Tacos /";

    /**
     *
     * @return entrante
     */

    @Override
    public String getPlatoAleatorio() {
        String entrante = "";
        int platoSeleccionado = (int) (Math.random()*4);

        switch (platoSeleccionado){
            case 0:
                entrante = entrante1;
                break;
            case 1:
                entrante = entrante2;
                break;
            case 2:
                entrante = entrante3;
                break;
            case 3:
                entrante = entratne4;
                break;
            default:
                System.out.println("Ha habido un error");
        }
        //System.out.println(platoSeleccionado);
        //System.out.println(entrante);
        return entrante;
    }
}
