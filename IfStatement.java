public class IfStatement {

    public static void main(String[] args) {
        boolean isBluetoohEnabled = true;
        int fileSended = 3;

        if(isBluetoohEnabled) {
            //send file
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("Por favor enciende el Bluetooh");
        }
    }
}
