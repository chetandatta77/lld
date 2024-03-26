package Robo.Flyweight;

import Robo.Domain.Sprites;

public class HumanoidRobot implements IRobot{

    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites sprites) {
        this.type = type;
        this.body = sprites;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the humanoid sprites object
        // and X and Y coordinate to render the image.
    }
}
