package Robo.Domain;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        for (int i=0; i<500000; i++){
            Sprites humanoidSprite = new Sprites();
            Robot humanoidRobotObject = new Robot(x+i,y+i, "HUMANOID", humanoidSprite);
        }

        for (int i=0; i<500000; i++){
            Sprites robotDogSprite = new Sprites();
            Robot robotDogObject = new Robot(x+i, y+i, "ROBOTIC_DOGS",robotDogSprite);
        }
    }
}
