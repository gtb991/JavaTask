package OOPTask;

public class MessageProcessor {

    public void process(Message message) {
              message.prepareMessage();
        System.out.printf(message.getBody());
    }


}
