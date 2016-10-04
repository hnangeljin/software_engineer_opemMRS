import java.util.LinkedList;
//done by Li Jie Ye and Angel Montero
public class UserContacts {
	
	private Long parentContactId;
	private LinkedList<Long> IdsOfcontacts;

	UserContacts(Long p){
		parentContactId = p;
		IdsOfcontacts = new LinkedList<Long>();
	}
	
	
	public void push(Long newContact){
		IdsOfcontacts.push(newContact);
	}
	
	
	
	public long getParentId(){
		return parentContactId;
	}
	
	
	public LinkedList<Long> getContacts(){
		return IdsOfcontacts;
	}
	
	
}
