package OOPTask;

public class Viber implements Message {
    private String body;

    @Override
    public String prepareMessage() {
        return body += " prepared Viber message; ";
    }

    @Override
    public String getBody() {
        return body;
    }

    public Viber(String body) {
        this.body = body;
    }
}
