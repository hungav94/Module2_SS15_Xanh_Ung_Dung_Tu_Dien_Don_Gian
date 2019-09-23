package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuDienController {

    @GetMapping("/tudien")
    public String index(){
        return "index";
    }

    @PostMapping("/result")
    public String Search(@RequestParam String eng, ModelMap model){
        model.put("hello", "xin chào");
        model.put("books", "quyển vở");
        model.put("computer", "máy tính");
        String result = (String) model.get(eng);
        if (result != null) {
            model.addAttribute("result", result);
            model.addAttribute("eng", eng);
        }
        return "result";
    }
}
