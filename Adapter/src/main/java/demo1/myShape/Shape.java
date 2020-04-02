package demo1.myShape;

/**
 * 适配器模式的基类
 */
public abstract class Shape {

    private String locationX;

    private String locationY;

    private String color;

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void display();

    public abstract void fill();

    public abstract void unDisplay();
}
