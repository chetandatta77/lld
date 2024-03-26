package Dodge;


import java.util.HashMap;

public class BallFactory {

    private static final HashMap<String, Ball> ballMap = new HashMap<>();

    public static Ball getBall(String color, String url){

        String ballCacheKey = color + url;
        Ball ball = ballMap.get(ballCacheKey);

        if (ball == null){
            ball = new Ball(color, url);
            ballMap.put(ballCacheKey,ball);
            System.out.println("Creating circle of color: " + color);
        }
        return ball;
    }

}
