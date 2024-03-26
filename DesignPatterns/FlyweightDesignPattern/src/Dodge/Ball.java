package Dodge;

public class Ball {

    private String color;
    private String imageUrl;

    private int cordX;
    private int cordY;
    private int radius;

    public Ball(String color, String imageUrl) {
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public String getColor() {
        return color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
