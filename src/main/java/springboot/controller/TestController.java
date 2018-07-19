package springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijunhao
 * @date 2018/07/05
 */
@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }

    @GetMapping("/helloworld1")
    public String helloworld1() {
        return "helloworld1";
    }

    @GetMapping("/helloworld2")
    public String helloworld2() {
        return "helloworld2";
    }

    @GetMapping("/helloworld3")
    public String helloworld3() {
        return "helloworld3";
    }
}
