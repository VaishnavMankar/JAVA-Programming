public class Main76 {
    public static void main(String[] args) {

        Car76_1 car = new Car76_1();
        car.setMake("MG");
        car.setModel("Thar");
        car.setDoor(2);
        car.setColor("Black");
        car.setConvertible(true);
        // this line will particularly show the function which we declared
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car76_1 targa = new Car76_1();
        targa.setMake("Tata");
        targa.setModel("Nexon");
        targa.setDoor(2);
        targa.setColor("red");
        targa.setConvertible(false);

        targa.describeCar();

    }
}
