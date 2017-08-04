package org.aks.bro.messenger.db;

import java.util.HashMap;
import java.util.Map;

import org.aks.bro.messenger.model.Message;

public class Database {
private static Map<Long,Message> msg=new HashMap<Long,Message>();
public static Map<Long,Message> getmsg(){
	return msg;
}
}
