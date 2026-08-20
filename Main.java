import view.Vista;
import model.Atleta;
import controller.Controlador;

public class Main{
    public static void main(String[] args) {
        Vista vista = new Vista();

        String nombre = vista.solicitarNombre();
        int numero = vista.solicitarNumero();
        int edad = vista.solicitarEdad();

        Atleta atleta = new Atleta(nombre, numero, edad);

        Controlador controlador = new Controlador(atleta, vista);

        controlador.iniciar();
    }
}