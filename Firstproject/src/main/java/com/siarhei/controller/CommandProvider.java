package com.siarhei.controller;
import java.util.HashMap;
import java.util.Map;

import com.siarhei.controller.impl.RegistrationUser;
import com.siarhei.controller.impl.SignInUser;

public final class CommandProvider {
	private static final CommandProvider instance  = new CommandProvider();
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	private CommandProvider() {
		commands.put(CommandName.SIGN_IN, new SignInUser());
		commands.put(CommandName.REGISTRATION, new RegistrationUser());
	}
	
	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		return commands.get(commandName);
	}
	
	public static CommandProvider getInstance() {
		return instance;
	}

}
