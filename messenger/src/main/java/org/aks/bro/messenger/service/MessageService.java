package org.aks.bro.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aks.bro.messenger.db.Database;
import org.aks.bro.messenger.model.Message;

public class MessageService {
	public MessageService() {
		Map<Long,Message> msg=Database.getmsg();
		msg.put(1L,new Message(1L,"Viva La Vida","Coldplay"));
		msg.put(2L,new Message(2L,"Your skin Oh yeah your skin glows","Coldplay"));
	}
	
	Map<Long,Message> msg=Database.getmsg();
	Message ms=new Message();
	public List<Message> messages(){
	return new ArrayList<Message>(msg.values());
	}
	public Message addMessage(Message message) {
		long id=ms.setId(msg.size()+1);
		return msg.put(id,message);
		
	}
	public Message thisid(long id) {
		return msg.get(id);
	}
}
