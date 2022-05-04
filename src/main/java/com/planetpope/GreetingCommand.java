package com.planetpope;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
  name = "greeting", 
  version = "0.0.2",
  mixinStandardHelpOptions = true
)
public class GreetingCommand implements Runnable {
    @Parameters(
      defaultValue = "picocli",
      description = "Your name."
    )
    String name;

    @Override
    public void run() {
      System.out.printf("Hello %s, go go commando!\n", name);
    }
}
