package ClassWork.Car;

public class Car {
    private int numberOfDoor;

    public Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public class door{
        private int height;
        private int weight;

        public door(int height,int weight) {
            this.height = height;
            this.weight = weight;
        }


        public void open(){
            System.out.println("Open the door");
        }

        public void close(){
            System.out.println("Close the door");
        }
    }

}
