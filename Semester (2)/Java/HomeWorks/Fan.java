public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public void setSpeed(int spe) {
        speed = spe;
    }

    public void setIsOn(boolean isOnOrOff) {
        isOn = isOnOrOff;
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public void setColor(String col) {
        color = col;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (isOn) {
            return "Speed: " + speed + "\nRadius: " + radius + "\nColor: " + color;
        } else {
            return "\nRadius: " + radius + "\nColor: " + color + "\nThe Fan Is Off";
        }
    }
}
