package Dodge;

import java.util.AbstractMap;
import java.util.Map;

public class DodgeMain {

    private static final String[] colors = {"Green", "Yellow", "Pink"};

    private static final Map<String, String> urlMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Green", "url1"),
            new AbstractMap.SimpleEntry<>("Yellow" ,"url2"),
            new AbstractMap.SimpleEntry<>("Pink", "url3")
    );

    private static String getColor(){
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        for (int i =0; i < 10; i++){
            String color = getColor();
            String url = urlMap.get(color);

            Ball ball = BallFactory.getBall(color, url);
            ball.setCordY(1);
            ball.setCordY(2);
            ball.setRadius(75);
            System.out.println(ball.hashCode());
        }
    }
}
