import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OptionalStreams {


    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball("Green"));
        balls.add(new Ball("Red"));
        balls.add(new Ball(null));
        balls.add(new Ball("Red"));

        long count = balls.stream()
        .map(Ball::getColour)
        .filter(Optional::isPresent)
        .map(Optional::get)
        .filter(colour -> colour.equals("Red"))
        .count();

        System.out.print(String.valueOf(count));
        /*
        The final filter checks the value of the String in the colour Optional. The map() and filter() calls and use of Optional prevent any NullPointerException being thrown for null values of the colour String.
         */

        long count2 = balls.stream().map(Ball::getColour)
        .filter(Optional::isPresent)
        .map(Optional::get)
        .collect(Collectors.toSet())
        .size();

        System.out.println(String.valueOf(count2));

        /*The calls to map() and filter() get the values of the colour field of the Ball objects, which are collected into a Set. The function calls successfully avoid the fact that some balls have null values for the colour field. */
    }
    
}

class Ball{
    public final Optional<String> colour;
    public Ball(String colour) {
        this.colour = Optional.ofNullable(colour);
    }
    public Optional<String> getColour(){
        return colour;
    }
}
