import org.json.simple.JSONObject;
//done by Li Jie Ye
public class MessageBlock {
	
	
	private final long mSenderId;
	private final long mRecipientId;
	private final String mMessage;
	private final String iv;
	
	
	MessageBlock(String siv,long sid, long rid, String msg){
		mSenderId = sid;
		mRecipientId = rid;
		mMessage = msg;
		iv =siv;
	}
	
	public JSONObject toJSON(){
		JSONObject resp = new JSONObject();
		
		resp.put("status","success");
		resp.put("senderid",mSenderId);
		resp.put("recipientid", mRecipientId);
		resp.put("message", mMessage);
		resp.put("iv", iv);
		
		
		
		return resp;
		
	}
	
	public long getRecipient(){
		return mRecipientId;
	}
	
	public String toJSONString(){
		return toJSON().toJSONString();
	}
	
	
}
