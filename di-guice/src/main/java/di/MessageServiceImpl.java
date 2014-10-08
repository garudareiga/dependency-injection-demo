package di;

import com.google.inject.Singleton;

@Singleton
public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello, MessageServiceImpl!";
	}

}
