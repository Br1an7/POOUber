class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void DatosAutos() {
        System.out.println("Lisencia: " + license + " Chofer: " + driver.name);
    }
}