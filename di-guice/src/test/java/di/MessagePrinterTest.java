package di;

import static org.junit.Assert.*;

import org.junit.*;

import com.google.inject.*;

import di.MessagePrinter;
import di.MessageService;

public class MessagePrinterTest {

	private Injector injector;
	
	@Before
	public void setUp() throws Exception {
		injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
			}
		});
	}
	
	@After
	public void tearDown() throws Exception {
		injector = null;
	}
	
	@Test
	public void test() {
		MessagePrinter printer = new MessagePrinter(injector.getInstance(MessageService.class));
		printer.printMessage();
		assertEquals("Hello, MockMessageService", printer.getMessage());
	}

}
