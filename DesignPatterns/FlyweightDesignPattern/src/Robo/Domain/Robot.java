package Robo.Domain;

public class Robot {

    int x; //4b
    int y; //4b
    String type; //50b
    Sprites body; // small 2d bitmap (graphic element) // 30 kb

    public Robot(int x, int y, String type, Sprites body) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.body = body;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }
}
