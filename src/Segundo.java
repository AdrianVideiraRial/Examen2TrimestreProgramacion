public class Segundo extends Plato{
    /**
     * Atributos.
     * Definimos los segundos a seleccionar.
     */

    private String segundo1 = "Segundo: Arroz con calamares /";
    private String segundo2 = "Segundo: Pollo al horno /";
    private String segundo3 = "Segundo: Churrasco de cerdo /";
    private String segundo4 = "Segundo: Ensalada César /";

    /**
     * Metodo para establece el plato de forma aleatoria.
     */

    @Override
    public String getPlatoAleatorio() {
        String segundo = "";
        int platoSeleccionado = (int) (Math.random()*4);

        switch (platoSeleccionado){
            case 0:
               segundo = segundo1;
                break;
            case 1:
                segundo = segundo2;
                break;
            case 2:
                segundo = segundo3;
                break;
            case 3:
                segundo = segundo4;
                break;
            default:
                System.out.println("Ha habido un error");
        }
        //System.out.println(platoSeleccionado);
        //System.out.println(segundo);
        return segundo;
    }

}
