package OOPTask;

public class Teams implements Message {
    private String body;

    @Override
    public String prepareMessage() {
        return body += " prepared Teams message; ";
    }

    @Override
    public String getBody() {
        return body;
    }

    public Teams(String body) {
        this.body = body;
    }
}
