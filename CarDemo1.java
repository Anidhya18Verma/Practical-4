class Car {
    String color;
    String body;

    Car() {
        this.color = "Blue";
        this.body = "Wagon";
    }

   
    Car(String color, String body) {
        this.color = color;
        this.body = body;
    }

    void display() {
        if (!color.equals("Blue")) {
            System.out.println("Car is " + color + " and has a " + body + " body.");
        } else {
            System.out.println("Car is Blue.");
        }
    }
}

public class CarDemo1 {
    public static void main(String args[]) {
        Car car1 = new Car(); 
        car1.display();

        System.out.println();

        Car car2 = new Car("Red", "Watertank"); 
        car2.display();
    }
}
