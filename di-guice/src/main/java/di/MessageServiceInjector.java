package di;

import com.google.inject.AbstractModule;

public class MessageServiceInjector extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MessageService.class).to(MessageServiceImpl.class);
	}
	
}
