import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamNullable {
    public static void main(String[] args){
        List<Map<Object, Object>> children = List.of(Map.of(), Map.of());
        Stream<Object> result = Stream.ofNullable(children);
        System.out.println(result.count());
        result = Stream.ofNullable(children).flatMap(Collection::stream);
        System.out.println(result.count());
    }
}
/**
 * the output is  1 2
 * 
 *Stream.ofNullable in the first result will return a stream of one object and flatMap in the second result will convert Object to Stream, which in our case contains two empty Maps
 */