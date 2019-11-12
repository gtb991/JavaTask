package OOPTask;

public class MMS implements Message {
    private String body;

    @Override
    public String prepareMessage() {
        return body += " prepared MMS message;";
    }

    @Override
    public String getBody() {
        return body;
    }

    public MMS(String body) {
        this.body = body;
    }
}
