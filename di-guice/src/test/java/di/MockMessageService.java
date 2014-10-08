package di;

import di.MessageService;

public class MockMessageService implements MessageService {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello, MockMessageService";
	}

}
