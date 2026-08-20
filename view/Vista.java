package view;
import java.util.Scanner;

import model.Atleta;

public class Vista{
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Registrar intento");
        System.out.println("2. Consultar todos los tiempos");
        System.out.println("3. Consultar un intento");
        System.out.println("4. Modificar un intento");
        System.out.println("5. Consultar promedio");
        System.out.println("6. Consultar mejor intento");
        System.out.println("7. Consultar peor intento");
        System.out.println("8. Consultar intentos realizados y disponibles");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");

        return scanner.nextInt();
    }

    public String solicitarNombre(){
        System.out.print("Ingrese el nombre del atleta: ");
        return scanner.nextLine();
    }
    
    public int solicitarNumero(){
        System.out.print("Ingrese el número del participante: ");
        return scanner.nextInt();
    }
    
    public int solicitarEdad(){
        System.out.print("Ingrese la edad del atleta: ");
        return scanner.nextInt();
    }
    
    public double solicitarTiempo(){
        System.out.print("Ingrese el tiempo en segundos: ");
        return scanner.nextDouble();
    }
    
    public int solicitarNumeroIntento(){
        System.out.print("Ingrese el número de intento: ");
        return scanner.nextInt();
    }
    
    public void mostrarDatosAtleta(Atleta atleta){
        System.out.println("\n--- DATOS DEL ATLETA ---");
        System.out.println("Nombre: " + atleta.getNombre());
        System.out.println("Número: " + atleta.getNumero());
        System.out.println("Edad: " + atleta.getEdad());
    }
    
    public void mostrarTiempos(double[] intentos, int cantidad){
        System.out.println("\n--- TIEMPOS REGISTRADOS ---");

        if (cantidad == 0) {
            System.out.println("No hay intentos registrados.");
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println(
                "Intento " + (i + 1) + ": " + intentos[i] + " segundos"
            );
        }
    }
    
    public void mostrarTiempo(double tiempo){
        System.out.println("Tiempo registrado: " + tiempo + " segundos");
    }
    
    public void mostrarPromedio(double promedio){
        System.out.println("Tiempo promedio: " + promedio + " segundos");
    }
    
    public void mostrarMejorIntento(double tiempo){
        System.out.println("Mejor intento: " + tiempo + " segundos");
    }
    
    public void mostrarPeorIntento(double tiempo){
        System.out.println("Peor intento: " + tiempo + " segundos");
    }
    
    public void mostrarIntentos(int realizados, int disponibles){
        System.out.println("Intentos realizados: " + realizados);
        System.out.println("Intentos disponibles: " + disponibles);
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}