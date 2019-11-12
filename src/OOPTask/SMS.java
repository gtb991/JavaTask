package OOPTask;

public class SMS implements Message{

    private String body;


    public SMS(String body) {
        this.body = body;
    }


    @Override
    public String prepareMessage() {
        return this.body += " prepared SMS message;";
    }

    @Override
    public String getBody() {
        return body;
    }


}
