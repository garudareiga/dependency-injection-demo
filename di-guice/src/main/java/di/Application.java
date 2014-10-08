package di;

import com.google.inject.*;

public class Application {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MessageServiceInjector());
		MessagePrinter printer = new MessagePrinter(injector.getInstance(MessageService.class));
		printer.printMessage();
	}

}
