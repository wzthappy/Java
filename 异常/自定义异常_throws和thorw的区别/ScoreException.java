package Java.异常.自定义异常_throws和thorw的区别;

public class ScoreException extends Exception {
    public ScoreException() {};
    public ScoreException(String message) {
        super(message);
    }
}
