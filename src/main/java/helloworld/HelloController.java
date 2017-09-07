/**
 * 
 */
package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HP PC
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloController {
	 @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(HelloController.class, args);
	    }

}
