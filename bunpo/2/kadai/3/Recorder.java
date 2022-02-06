import java.util.HashMap;
import java.util.Map;

public class Recorder {
    private Map map = new HashMap();

    public void execute(String key, String value) {
        if (key == null && value == null) {
            this.map.clear();
            System.out.println("Empty");
        } else if (key != null && value == null) {
            System.out.println(this.map.get(key));
        } else if (key != null && value.equals("Delete")) {
            Object removed = this.map.remove(key);
            if (removed == null) {
                throw new IllegalArgumentException();
            } else {
                System.out.println(key + " deleted");
            }
        } else {
            this.map.put(key, value);
            System.out.println(key + "=" + value);
        }
    }

}