package OOPTask;

public class JsonMessage implements Message {

    private String body;

    public String prepareMessage() {
        return body += " prepared JsonMessage; ";
        // body +="prepared message"
        // int a = 5;
        // int b = 7;
        // int sum = 4;
        // sum += a+b
    }

    @Override
    public String getBody() {
        return body;
    }

    public JsonMessage(String body) {
        this.body = body;
    }
}
