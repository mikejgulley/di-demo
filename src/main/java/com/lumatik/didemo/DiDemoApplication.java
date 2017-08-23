package com.lumatik.didemo;

import com.lumatik.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// Must cast to MyController - no need to instantiate - Spring did this for us
		MyController controller = (MyController) ctx.getBean("myController"); // must use lowercase first letter!
		controller.hello();
	}
}
