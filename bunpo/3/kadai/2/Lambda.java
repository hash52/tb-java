import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 10000);
        stream.forEach(s -> System.out
                .println(DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(LocalDateTime.now()) + " " + s));
    }
}