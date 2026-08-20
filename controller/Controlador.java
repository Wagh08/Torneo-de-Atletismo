package controller;
import model.Atleta;
import view.Vista;

public class Controlador{
    private Atleta atleta;
    private Vista vista;

    public Controlador(Atleta atleta, Vista vista){
        this.atleta = atleta;
        this.vista = vista;
    }

    public void iniciar(){
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    registrarIntento();
                    break;

                case 2:
                    consultarTiempos();
                    break;

                case 3:
                    consultarIntento();
                    break;

                case 4:
                    modificarIntento();
                    break;

                case 5:
                    consultarPromedio();
                    break;

                case 6:
                    consultarMejorIntento();
                    break;

                case 7:
                    consultarPeorIntento();
                    break;

                case 8:
                    consultarIntentosRealizados();
                    break;

                case 9:
                    vista.mostrarMensaje("Programa finalizado.");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida.");
            }

        } while (opcion != 9);
    }
    
    public void registrarIntento(){
         double tiempo = vista.solicitarTiempo();

        boolean registrado = atleta.registrarIntento(tiempo);

        if (registrado) {
            vista.mostrarMensaje("Intento registrado correctamente.");
        } else {
            vista.mostrarMensaje("No se pudo registrar el intento.");
        }
    }
    
    public void consultarTiempos(){
         vista.mostrarTiempos(
            atleta.getIntentos(),
            atleta.getCantidadIntentos()
        );
    }
    
    public void consultarIntento(){
         int numeroIntento = vista.solicitarNumeroIntento();

        double tiempo = atleta.consultarIntento(numeroIntento);

        if (tiempo != -1) {
            vista.mostrarTiempo(tiempo);
        } else {
            vista.mostrarMensaje("El intento no existe.");
        }
    }
    
    public void modificarIntento(){
        int numeroIntento = vista.solicitarNumeroIntento();
        double nuevoTiempo = vista.solicitarTiempo();

        boolean modificado =
            atleta.modificarIntento(numeroIntento, nuevoTiempo);

        if (modificado) {
            vista.mostrarMensaje("Intento modificado correctamente.");
        } else {
            vista.mostrarMensaje("No se pudo modificar el intento.");
        }
    }
    
    public void consultarPromedio(){
        if (atleta.getCantidadIntentos() > 0) {

            double promedio = atleta.calcularPromedio();
            vista.mostrarPromedio(promedio);

        } else {
            vista.mostrarMensaje("No hay intentos registrados.");
        }
    }
    
    public void consultarMejorIntento(){
         double mejor = atleta.obtenerMejorIntento();

        if (mejor != -1) {
            vista.mostrarMejorIntento(mejor);
        } else {
            vista.mostrarMensaje("No hay intentos registrados.");
        }
    }
    
    public void consultarPeorIntento(){
        double peor = atleta.obtenerPeorIntento();

        if (peor != -1) {
            vista.mostrarPeorIntento(peor);
        } else {
            vista.mostrarMensaje("No hay intentos registrados.");
        }
    }
    
    public void consultarIntentosRealizados(){
        int realizados = atleta.getCantidadIntentos();
        int disponibles = atleta.getIntentosDisponibles();

        vista.mostrarIntentos(realizados, disponibles);
    }
}