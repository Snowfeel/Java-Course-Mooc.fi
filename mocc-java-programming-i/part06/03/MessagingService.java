import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> msg;

    public MessagingService(){
        this.msg = new ArrayList<>();
    }
    public void add(Message message){
        if (message.getContent().length() <= 280){
            msg.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return msg;
    }
}
