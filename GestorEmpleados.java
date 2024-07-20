public class GestorEmpleados {
    // Array de empleados y un contador para el número de empleados actuales
    private Empleado[] empleados;
    private int numEmpleados;
    
    // Constructor
    public GestorEmpleados(int capacidad) {
        empleados = new Empleado[capacidad];
        numEmpleados = 0;
    }
    
    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados] = empleado;
            numEmpleados++;
        } else {
            System.out.println("No se pueden agregar más empleados. Capacidad máxima alcanzada.");
        }
    }
    
    // Método para mostrar los detalles de los empleados existentes
    public void mostrarEmpleados() {
        for (int i = 0; i < numEmpleados; i++) {
            empleados[i].imprimirInformacion();
            System.out.println(); // Línea en blanco entre empleados
        }
    }

    // Método para obtener el número actual de empleados
    public int getNumEmpleados() {
        return numEmpleados;
    }
}
