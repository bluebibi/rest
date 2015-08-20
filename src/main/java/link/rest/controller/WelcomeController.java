package link.rest.controller;

import link.rest.domain.Test;
import link.rest.repository.TestMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.Date;

/**
 * Created by yhhan on 15. 8. 12..
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

    @Inject
    private TestMapper testMapper;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Value("${env.text}")
    private String env;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        return "welcome";
    }

    @RequestMapping("/env")
    @ResponseBody
    public String env() {
        return env;
    }

    @RequestMapping("/mybatis")
    @ResponseBody
    public String mybatis() {
        Test newTestObject = new Test();
        newTestObject.setText("insert test");
        testMapper.insert(newTestObject);
        System.out.println("newTestObject = " + newTestObject);

        Test storedTestObject = testMapper.findOne(newTestObject.getId());
        storedTestObject.setText("update test");
        testMapper.update(storedTestObject);
        System.out.println("storedTestObject = " + storedTestObject);

        return storedTestObject.getText();
    }
}