import java.util.LinkedList;
//done by Li Jie Ye
public class MessageStore {
	
	
	private Long recipientId;
	
	private LinkedList<MessageBlock> messages;
	//private LinkedList<MessageBlock> unFetchedMessages;

	MessageStore(Long p){
		recipientId = p;
		messages = new LinkedList<MessageBlock>();
	}
	
	
	public void push(MessageBlock msg){
		messages.push(msg);
	}
	
	
	
	public long getRecipientId(){
		return recipientId;
	}
	
	
	private LinkedList<MessageBlock> getMessage(){
		return messages;
	}
	
	public MessageBlock getAMessage(){
		if (messages.isEmpty()) return null;
		else return messages.pop();
	}
	
	
	

}
