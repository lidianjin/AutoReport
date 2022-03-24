import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloFreeMaker {

    @RequestMapping("/freeTest")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("var","FreeMarker");
        return "test";
    }

}
