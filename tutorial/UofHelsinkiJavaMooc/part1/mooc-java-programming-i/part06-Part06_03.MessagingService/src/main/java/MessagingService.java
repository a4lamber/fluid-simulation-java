/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author yixiangzhang
 */
public class MessagingService {
    // attributes
    private ArrayList<Message> messages; 
    
    // constructors
    public MessagingService() {
        messages = new ArrayList<Message>();
    }
    
    // methods
    public void add(Message message) {
        // only add message if content <= 280
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        // returns the messages added to the messaging services
        return this.messages;
    }
}
