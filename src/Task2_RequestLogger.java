import java.util.HashMap;

public class Task2_RequestLogger {
    HashMap<String, Integer> requests;
    int timeLimit;
    public Task2_RequestLogger(int timeLimit) {
        this.timeLimit = Math.max(timeLimit, 0);
        requests = new HashMap<String, Integer>();
    }

    public boolean messageRequestDecision(int timestamp, String request)
    {
        if (!requests.containsKey(request) || (requests.get(request) + timeLimit <= timestamp)) {
            requests.put(request, timestamp);
            return true;
        }
        else {
            return false;
        }
    }
}
