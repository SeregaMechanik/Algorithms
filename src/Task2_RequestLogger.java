import java.util.LinkedList;

public class Task2_RequestLogger {
    LinkedList<Request> requests;
    int timeLimit;
    public Task2_RequestLogger(int timeLimit) {
        this.timeLimit = timeLimit;
        requests = new LinkedList<>();
    }

    public boolean messageRequestDecision(int timestamp, String request)
    {
        int forDel = 0;
        for (Request r : requests) {
            if (r.timestamp <= timestamp - timeLimit) {
                forDel++;
            }
            else if ((r.message.equals(request))) {
                return false;
            }
        }
        for (int i = 0; i < forDel; i++) {
            requests.pop();
        }
        requests.add(new Request(request, timestamp));
        return true;
    }
}
