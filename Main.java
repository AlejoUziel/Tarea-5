import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la capacidad máxima de empleados: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        GestorEmpleados gestor = new GestorEmpleados(capacidad);
        
        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    if (gestor.getNumEmpleados() < capacidad) {
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del empleado: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese el salario del empleado: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar el buffer

                        Empleado empleado = new Empleado(nombre, edad, salario);
                        gestor.agregarEmpleado(empleado);
                    } else {
                        System.out.println("Capacidad máxima de empleados alcanzada. No se puede agregar más empleados.");
                    }
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
