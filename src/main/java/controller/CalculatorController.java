package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculary")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("calculary");
        return modelAndView;
    }

    @PostMapping("/calculary")
    public ModelAndView chuyentien(@RequestParam("calculary1") int value1, @RequestParam("calculary2") int value2, @RequestParam("calculary3") String value3) {
        ModelAndView modelAndView = new ModelAndView("/calculary");
        if (value3.equals("Addition")) {
            int result1 = value1 + value2;
            modelAndView.addObject("result", result1);
        } else if (value3.equals("Subtraction")) {
            int result2 = value1 - value2;
            modelAndView.addObject("result", result2);
        } else if (value3.equals("Multiplication")) {
            int result3 = value1 * value2;
            modelAndView.addObject("result", result3);
        } else if (value3.equals("Division")) {
            int result4 = value1 / value2;
            modelAndView.addObject("result", result4);
        }
        return modelAndView;
    }
}
