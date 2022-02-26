class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car();
        car.driver = "Yo merenges";
        car.license = "no tengo";
        car.passegenger = 15;
        car.DatosAutos();

        Car car2 = new Car();
        car2.driver = "Yo";
        car2.license = "SI tengo";
        car2.passegenger = 5;
        car2.DatosAutos();
    }
}