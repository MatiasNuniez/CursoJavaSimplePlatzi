public class SwitchStatement {

    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste el Dark Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark");
                break;
            default:
                System.out.println("Selecciona una opcion"); // Cuando ninguna de las opciones son correctas muestra este msj.
        }
    }
}