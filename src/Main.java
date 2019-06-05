 class Car {
        private int cylinders;
        private String name;
        private int wheels;
        private boolean engine;

        public Car(int cylinders, String name){
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }


        public double getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
        public String startEngine(){
            return "Engine Start";
        }

        public String accelerate(){
            return "Car is accelerating";
        }

        public String brake(){
            return "Car is slowing down";
        }
    }

    class Bmw extends Car {
        public Bmw(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "BMW start engine";
        }

        @Override
        public String accelerate() {
            return "BMW is accelerating";
        }

        @Override
        public String brake() {
            return "BMW brake";
        }
    }

    class Jeep extends Car {
        public Jeep(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Jeep start engine";
        }

        @Override
        public String accelerate() {
            return "Jeep is accelerating";
        }

        @Override
        public String brake() {
            return "Jeep brake";
        }
    }

    public class Main {
        public static void main(String[] args) {
            // We are going to go back to the car analogy
            // Create a base class called Car
            // It should have a few fields that would be appropriate for a generic car class
            // engine, cylinders, wheels, etc.
            // Constructor should initialize cylinders (number of) and name, and set wheels to 4
            // and engine to true. Cylinders and names would be passed parameters.
            //
            // Create appropriate getters
            //
            // Create some methods like startEngine, accelerate, and brake
            //
            // show a message for each in the base class
            // Now create 3 sub classes for your favorite vehicles.
            // Override the appropriate methods to demonstrate polymorphism in use.
            // put all classes in the one java file (this one)

            Car car = new Car(8, "Base Car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());

            Bmw bmw = new Bmw(6, "Bmw");
            System.out.println(bmw.startEngine());
            System.out.println(bmw.accelerate());
            System.out.println(bmw.brake());
        }
    }
