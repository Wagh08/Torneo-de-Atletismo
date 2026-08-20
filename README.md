# Torneo-de-Atletismo

## Integrantes
- William García 261035
- Julio Ortiz

## Análisis
Se realizará un programa para un torneo de atletismo, capaz de registrar atletas y sus datos. Así también permitirá que se calculen los mejores tiempos y así como los datos completos de los atletas.

Para ello se utilizarán 4 clases: Atleta, Vista, Controlador y Main.

Atleta contará con propiedades para registrar su información (nombre, edad, número de participante, edad, arreglo de intentos y cantidad de intentos). También contará con métodos: su constructor, métodos para obtener su información, y métodos para calcular información importante como su mejor intento o los intentos que le faltan por realizar.

Vista contará con una propiedad de scanner para obtener lo que el usuario ingrese. En sus métodos contará con métodos para mostrar el menú, solicitar la información que calculó el atleta y mostrar los datos solicitados por el usuario.

Controlador contará con propiedades de Atleta y Vista, para poder utilizar dichas clases, y tendrá métodos para hacer las solicitudes de vista al atleta y determinar si se realizaron con éxito.

En el Main se crearán los objetos y se iniciará el programa. 

El Controlador solicitará a la Vista los datos ingresados por el usuario, pedirá al Atleta que realice las operaciones correspondientes y enviará los resultados a la Vista para mostrarlos, por lo que tendrá una asociación con Atleta y Vista. Por su parte, Main tendrá una dependencia con estas clases, ya que se encargará de crear sus objetos e iniciar el programa.

# Clases
1. Clase Atleta
Propiedades:
- private String nombre
- private int numero
- private int edad
- private double[] intentos
- private int cantidadIntentos

Métodos:
- public Atleta(String nombre, int numero, int edad)
- public String getNombre()
- public int getNumero()
- public int getEdad()
- public boolean registrarIntento(double tiempo)
- public double consultarIntento(int intento)
- public boolean modificarIntento(int intento, double nuevoTiempo)
- public double calcularPromedio()
- public double obtenerMejorIntento()
- public double obtenerPeorIntento()
- public int getCantidadIntentos()
- public int getIntentosDisponibles()
- public double[] getIntentos()

2. Clase Vista
Propiedades:
- private Scanner scanner

Métodos:
- public int mostrarMenu()
- public String solicitarNombre()
- public int solicitarNumero()
- public int solicitarEdad()
- public double solicitarTiempo()
- public int solicitarNumeroIntento()
- public void mostrarDatosAtleta(Atleta atleta)
- public void mostrarTiempos(double[] intentos, int cantidad)
- public void mostrarTiempo(double tiempo)
- public void mostrarPromedio(double promedio)
- public void mostrarMejorIntento(double tiempo)
- public void mostrarPeorIntento(double tiempo)
- public void mostrarIntentos(int realizados, int disponibles)
- public void mostrarMensaje(String mensaje)
   
3. Clase Controlador
Propiedades:
private Atleta atleta
private Vista vista

Métodos:
- public Controlador(Atleta atleta, Vista vista)
- public void iniciar()
- public void registrarIntento()
- public void consultarTiempos()
- public void consultarIntento()
- public void modificarIntento()
- public void consultarPromedio()
- public void consultarMejorIntento()
- public void consultarPeorIntento()
- public void consultarIntentosRealizados()

Los valores iniciales del objeto Atleta se proporcionarán mediante su constructor o serán 0 al inicio. Mientras que de vista se usará scanner y en el controlador sus valores iniciales son los de las clases de atleta y vista.

Se utilizará una variable que cuente el intento que se ha registrado, con cada intento registrado aumenta, de modo que así se sabrá la siguiente posición disponible en el arreglo.

La variable que cuenta cada intento registrado también se utilizará para mostrar solo las posiciones con un valor, al usarlo en un for de esa variable menos uno.
