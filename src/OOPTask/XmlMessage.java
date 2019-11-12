package OOPTask;

public class XmlMessage implements Message {
    private  String body;
    public String prepareMessage(){
        return this.body += " prepared XMLmessage; ";
    }

    @Override
    public String getBody() {
        return body;
    }

    public XmlMessage(String body) {
        this.body = body;
    }
}
