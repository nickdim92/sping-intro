package oslomet.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeiController {
    @GetMapping("/")
    public String hei(String navn) {
        int lengde = navn.length();
        return "Hei verden" + navn + "! Navnet ditt har "+lengde+" bokstaver.";
    }
}
