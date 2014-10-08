package di;

import com.google.inject.Inject;

public class MessagePrinter {
	final private MessageService service;
	
	@Inject
	public MessagePrinter(MessageService service) {
		this.service = service;
	}

	public void printMessage() {
		System.out.println(this.service.getMessage());
	}
	
	public String getMessage() {
		return this.service.getMessage();
	}
}
