public class RecorderRunner {
    public static void main(String[] args) {
        Recorder recorder = new Recorder();
        recorder.execute("key1", "value1");
        recorder.execute("key1", null);
        recorder.execute("key1", "Delete");
        try {
            recorder.execute("key10", "Delete");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        recorder.execute("key2", "value2");
        recorder.execute(null, null);
    }
}