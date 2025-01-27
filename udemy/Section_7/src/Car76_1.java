// video 76 and 77
public class Car76_1{

    private String make = "TATA";
    private String model = "Nexon";
    private String color = "Gray";
    private int door = 4;
    private boolean convertible = true;
    // from here its video 77
    public  String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make){
        if (make == null)  make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "Suzuki" , "Hindustan motor", "MG" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(door + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
}
