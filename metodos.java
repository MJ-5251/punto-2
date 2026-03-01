public class metodos {

    public void sumarInventario(datos[][] m) {

        int t = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                t = t + m[i][j].getCantidad();

            }
        }

        System.out.println("El inventario total de la tienda es de: " + t + " productos");
        System.out.println("+----------------------------+");
    }
}