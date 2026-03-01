public class principal {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda pispirisnais");
        System.out.println("----------------------------");
        datos[][] matriz = new datos[2][2];

        matriz[0][0] = new datos("Arroz", 5000, 1);
        matriz[0][1] = new datos("Leche", 3000, 3);
        matriz[1][0] = new datos("Pan", 1500, 4);
        matriz[1][1] = new datos("Huevos", 8000, 2);

        metodos o = new metodos();
        o.sumarInventario(matriz);
    }
}