//done by Li Jie Ye
public class UserContactsResponse {
	
	String response;
	
	UserContactsResponse(String resp){
		response =resp;
	}
	
	String toJSONString(){
		return response;
	}
	

}
