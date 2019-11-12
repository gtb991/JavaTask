package OOPTask;

public class Main {
    public static void main(String[] args) {
        MessageConverter converter = new MessageConverter();
        XmlMessage xmlMessage = new XmlMessage(" Salut!");
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.process(xmlMessage);
        JsonMessage jsonMessage = new JsonMessage(" Hello!!");
        MessageProcessor messageProcessor1 = new MessageProcessor();
        messageProcessor1.process(jsonMessage);
        SMS sms = new SMS(" Privet!!!");
        MessageProcessor messageProcessor2 = new MessageProcessor();
        messageProcessor2.process(sms);
        MMS mms = new MMS(" Bonjour!!!!");
        MessageProcessor messageProcessor3 = new MessageProcessor();
        messageProcessor3.process(mms);
        Viber viber = new Viber(" Hopa tzup! hopa tzup!!");
        MessageProcessor messageProcessor4 = new MessageProcessor();
        messageProcessor4.process(viber);



        System.out.println(" ");
        System.out.println(" Converted XMLmessage: " + converter.convert(xmlMessage));
        System.out.println(" Converted JSONmessage: " + converter.convert(jsonMessage));
        System.out.println(" Converted SMSmessage: "+converter.convert(sms));
        System.out.println(" Converted MMSmessage: "+converter.convert(mms));
        System.out.println(" Converted Viber: "+converter.convert(viber));



    }
}
