public class PruebaEstudiante {
    public static void main(String[] args) {
        try {
            Estudiante estudiante1 = new Estudiante("Santiago1", 20, 10);
            Estudiante estudiante2 = new Estudiante("Santiago", 22, 9.8);

            System.out.println("Estudiante 1:");
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Edad: " + estudiante1.getEdad());
            System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

            System.out.println("\nEstudiante 2:");
            System.out.println("Nombre: " + estudiante2.getNombre());
            System.out.println("Edad: " + estudiante2.getEdad());
            System.out.println("Nota Promedio: " + estudiante2.getNotaPromedio());

            estudiante1.setNotaPromedio(11.0); 

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

