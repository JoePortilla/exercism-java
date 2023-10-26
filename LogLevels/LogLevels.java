public class LogLevels {

    public static void main(String[] args) {
        System.out.println(reformat("[INFO]: Operation completed"));

    }

    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        String msg = parts[1].trim();
        return msg;
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":");
        String msg = parts[0].replaceAll("\\[|\\]", "");
        msg = msg.toLowerCase();
        return msg;
    }

    public static String reformat(String logLine) {
        String msg = LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";

        return msg;
    }
}