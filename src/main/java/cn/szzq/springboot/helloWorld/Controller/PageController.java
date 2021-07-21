package cn.szzq.springboot.helloWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
public class PageController {
    @RequestMapping("/test")
    public String test(){
        return "helloWorld111";
    }
}*/
@Controller
public class PageController {
    @RequestMapping("/test1")
    public @ResponseBody String test() {
        return "helloWorld111";
    }
}