    public class Car {
        private String model;
        private int speed;
        private double miles;

        public void updateSpeed(int speed){
            this.speed = speed;
        }

        public void updateMiles(double miles){
            this.miles = miles;
        }

        public double getMiles(){
            return miles;
        }

        public int getSpeed(){
            return speed;
        }

        public String getModel(){
            return model;
        }

        public Car(String model, int speed, double miles){
            this.model = model;
            this.speed = speed;
            this.miles = miles;
        }
    }
