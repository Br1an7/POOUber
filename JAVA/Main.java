class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("No tengo", new Account("Yo", "DNI"));
        car.passegenger = 15;
        car.DatosAutos();

        Car car2 = new Car("Si tengo", new Account("Yo", "DNI"));
        car2.passegenger = 5;
        car2.DatosAutos();
    }
}