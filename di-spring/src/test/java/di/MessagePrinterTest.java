package di;

import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class MessagePrinterTest {
	private AnnotationConfigApplicationContext context = null;
	
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
	
	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(MessagePrinterTest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}
	
	@Test
	public void test() {
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		assertEquals("Hello World!", printer.getMessage());
	}

}
