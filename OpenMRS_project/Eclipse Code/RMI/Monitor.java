//done by Li Jie Ye and Angel Montero
public class Monitor {
	
	Monitor(){
		
	}
	
	synchronized void getOwnership(){
		
		//hah hahah your mine!
		try{
			notifyAll();
		} catch (IllegalMonitorStateException e){
			e.printStackTrace();
		}
	}
	
	

}
