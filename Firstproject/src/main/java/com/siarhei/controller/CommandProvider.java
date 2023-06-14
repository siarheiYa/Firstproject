package com.siarhei.controller;
import java.util.HashMap;
import java.util.Map;

import com.siarhei.controller.impl.RegistrationUser;
import com.siarhei.controller.impl.SignInUser;
import com.siarhei.controller.impl.GoToBasePage;
import com.siarhei.controller.impl.SignOut;
import com.siarhei.controller.impl.GoToNewsList;
import com.siarhei.controller.impl.GoToViewNews;

public final class CommandProvider {
	
	public Map<CommandName, Command> commands = new HashMap<>();
	
	CommandProvider() {
		commands.put(CommandName.SIGN_IN, new SignInUser());
		commands.put(CommandName.REGISTRATION, new RegistrationUser());
		commands.put(CommandName.GO_TO_BASE_PAGE, new GoToBasePage());
		commands.put(CommandName.SIGN_OUT,new SignOut());
		commands.put(CommandName.GO_TO_NEWS_LIST, new GoToNewsList());
		commands.put(CommandName.GO_TO_VIEW_NEWS, new GoToViewNews());
		
		
	}
	
	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}

}
