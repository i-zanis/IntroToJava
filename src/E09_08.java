public class E09_08 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
    }

    static class Fan {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        Fan() {
        }

        public int getSpeed() {
            return speed;
        }

        public int setSpeed(int speedName) throws IllegalArgumentException {
            if (speedName != SLOW || speedName != MEDIUM || speedName != FAST) {
                throw new RuntimeException("Speed has only 3 modes");
            } else return speed = speedName;
        }

        public void turnSwitch() {
            on = !on;
        }

        public boolean checkStatus() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double newRadius) {
            radius = newRadius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String newColor) {
            color = newColor;
        }

        @Override
        public String toString() {
            return "speed " + speed + "\n"
                    + "color " + color + "\n"
                    + "radius " + radius + "\n"
                    + ((on) ? "fan is on" : "fan is off");
        }
        }
    }

