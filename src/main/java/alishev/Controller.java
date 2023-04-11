package alishev;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String hello(@RequestParam("userInput") String userInput, Model model) {
        model.addAttribute("userInput", VOIDS.USDcounter(Integer.parseInt(userInput)));
        return "hello";
    }

}
