package cs6380.node;

public interface ClientProtocol {
	int PROTOCOL_LEN = 2;
	
	// public msg
	String MSG_ROUND = "���";
	
	//login message heading
	String LOGIN = "�ǡ�";
	// protocol used to respond for invalid username
	String NAME_REP = "-1";
	
	//private msg protocol
	String PRIVATE_ROUND = "�";
	
	//test message heading
	String TEST = "%$";
	
	//split sign used to seperate user and private message
	String SPLIT_SIGN = "��";
}
