public class Arrays {

    public static void main(String[] args) {

        // el array en java se declara estatico osea que no siempre es bueno usar el array, sino como por ejemplo en los dias de la semana seria ideal usarlo.
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];// arreglo de dos dimensiones, es ideal verlo como tablas

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i <= 3; i++) {
            System.out.println(androidVersions[i]);
        }

        System.out.println();
        System.out.println();


        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
