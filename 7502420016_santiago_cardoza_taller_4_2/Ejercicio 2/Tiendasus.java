public class Tiendasus {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ferrari", "Inferno", 980);

        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima() + " km/h");

        coche1.acelerar(20);  
        coche1.acelerar(-10); 
    }
}
