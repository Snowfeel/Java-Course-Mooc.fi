import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));

        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }
        System.out.println(messages.size());
    }
}
