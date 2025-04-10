package am.logiclab.eduscore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/start")
    public String test() {
        return "start";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/teacher-panel")
    public String teacher() {
        return "teacher-panel";
    }

    @GetMapping("/admin-panel")
    public String admin() {
        return "admin-panel";
    }

}
