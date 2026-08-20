package model;

public class Atleta{

    private String nombre;
    private int numero;
    private int edad;
    private double[] intentos;
    private int cantidadIntentos;

    public Atleta(String nombre, int numero, int edad){
        this.nombre = nombre;
        this.numero = numero;
        this.edad = edad;
        this.intentos = new double[10];
        this.cantidadIntentos = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumero(){
        return numero;
    }

    public int getEdad(){
        return edad;
    }

    public boolean registrarIntento(double tiempo){
        if (tiempo > 0 && cantidadIntentos < 10){
            intentos[cantidadIntentos] = tiempo;
            cantidadIntentos++;
            return true;
        }
        return false;
    }

    public double consultarIntento(int intento){
        if (intento >= 1 && intento <= cantidadIntentos) {
            return intentos[intento - 1];
        }

        return -1;
        }

    public boolean modificarIntento(int intento, double nuevoTiempo){

        if (intento >= 1 && intento <= cantidadIntentos && nuevoTiempo > 0) {
            intentos[intento - 1] = nuevoTiempo;
            return true;
        }

        return false;
    }

    public double calcularPromedio(){
        if (cantidadIntentos == 0) {
            return 0;
        }

        double suma = 0;

        for (int i = 0; i < cantidadIntentos; i++) {
            suma += intentos[i];
        }

        return suma / cantidadIntentos;
    }

    public double obtenerMejorIntento(){
        if (cantidadIntentos == 0) {
            return -1;
        }

        double mejor = intentos[0];

        for (int i = 1; i < cantidadIntentos; i++) {
            if (intentos[i] < mejor) {
                mejor = intentos[i];
            }
        }

        return mejor;
    }

    public double obtenerPeorIntento(){
        if (cantidadIntentos == 0) {
            return -1;
        }

        double peor = intentos[0];

        for (int i = 1; i < cantidadIntentos; i++) {
            if (intentos[i] > peor) {
                peor = intentos[i];
            }
        }

        return peor;
    }

    public int getCantidadIntentos(){
        return cantidadIntentos;
    }

    public int getIntentosDisponibles(){
        return 10 - cantidadIntentos;
    }

    public double[] getIntentos(){
        return intentos;
    }
}