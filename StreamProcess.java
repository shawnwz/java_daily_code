import java.util.stream.Stream;

public class StreamProcess {
    public static void main(String[] args){
        System.out.println(
            Stream.of("1","22",null, "333")
            .filter(x -> x.length() > 2)
            .map(x -> "0" + x)
            );
    }
}
/*
Operations declared in stream will not be invoked because there is no terminal operation. As a result the instance of the Stream class itself will be passed to System.out.println. This will invoke toString on the passed Object.
 */