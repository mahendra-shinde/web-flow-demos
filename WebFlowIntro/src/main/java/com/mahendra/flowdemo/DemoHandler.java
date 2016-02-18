package com.mahendra.flowdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
  
/* URL: http://localhost:8081/webFlow/membership.do
 * 
 * Web flow takes care of Double Submit and repeated refresh.
 * Web flow has 5 extra scopes in addition to HTTP scopes
 * 1. HTTP Request:	
 * 2. Request:
 * 3. Flow:
 * 4. Flash:
 * 5. view: Limited to single form.
 * 6. Conversation: Limited to a browser tab.
 * 7. HTTP Session:
 * 8. HTTP Application:
 */
@Component
public class DemoHandler {
 
	private static Logger log =  LoggerFactory.getLogger(DemoHandler.class);
	
	public UserBean initFlow(){
		log.info("Flow started");
		return new UserBean();
	}
 
	public String validateDetails(UserBean userBean,MessageContext messageContext){
		String status = "success";
		log.info("Validation started");
		if(userBean.getUserId().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userId").defaultText("UserId cannot be Empty").build());
			log.info("Empty userid");
			status = "failure";
		}
		if(userBean.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			log.info("Empty email");
			status = "failure";
		}
		if(userBean.getAge()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"age").defaultText("Age cannot be Empty").build());
			log.info("Empty age");
			status = "failure";
		}
		log.info("Validation was successful!");
		return status;
	}
}