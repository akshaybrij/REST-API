package org.aks.bro.messenger;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.aks.bro.messenger.model.Message;
import org.aks.bro.messenger.service.MessageService;
@Path("message")
public class MessageResource {
	MessageService msg=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
public List<Message> getMessage() {
	return msg.messages();
}
	@GET
	@Path("/{msgid}")
	@Produces(MediaType.APPLICATION_XML)
	
	public Message getSingleMsg(@PathParam("msgid") long id) {
		return msg.thisid(id);
	}
}
