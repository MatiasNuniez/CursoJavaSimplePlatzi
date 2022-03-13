import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int response = 0;

        do {

            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1 - Movies");
            System.out.println("2 - Series");
            System.out.println("3 - Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 3:
                    System.out.println("Gracias por visitar el sitio");
                    break;
                    default:
                        System.out.println("Seleccione una opcion correcta");
            }
        }while (response != 3);
            System.out.println("Se termino el programa");
    }

}
