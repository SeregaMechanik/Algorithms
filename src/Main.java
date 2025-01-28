public class Main {
    public static void main(String[] args)
    {
        Task2_RequestLogger requestLogger = new Task2_RequestLogger(7);
        System.out.println(requestLogger.messageRequestDecision(1,"good morning"));
        System.out.println(requestLogger.messageRequestDecision(5,"good morning"));
        System.out.println(requestLogger.messageRequestDecision(9,"i need coffee"));
        System.out.println(requestLogger.messageRequestDecision(10,"hello world"));
        System.out.println(requestLogger.messageRequestDecision(11,"good morning"));
        System.out.println(requestLogger.messageRequestDecision(15,"i need coffee"));
        System.out.println(requestLogger.messageRequestDecision(17,"hello world"));
        System.out.println(requestLogger.messageRequestDecision(25,"i need coffee"));
    }

}