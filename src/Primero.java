public class Primero extends  Plato{
    /**
     * Atributos.
     * Definimos los primeros a seleccionar.
     */

    private String primero1 = "Primero: Pescado con patatas /";
    private String primero2 = "Primero: Arroz con carne /";
    private String primero3 = "Primero: Poke /";
    private String primero4 = "Primero: Burrito /";

    /**
     * Metodo para establece el plato de forma aleatoria.
     */

    @Override
    public String getPlatoAleatorio () {
        String primero = "";
        int platoSeleccionado = (int) (Math.random()*4);

        switch (platoSeleccionado){
            case 0:
                primero = primero1;
                break;
            case 1:
                primero = primero2;
                break;
            case 2:
                primero = primero3;
                break;
            case 3:
                primero = primero4;
                break;
            default:
                System.out.println("Ha habido un error");
        }
        //System.out.println(platoSeleccionado);
        //System.out.println(primero);
        return primero;
    }

}
