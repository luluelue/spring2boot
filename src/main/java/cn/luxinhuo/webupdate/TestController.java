package cn.luxinhuo.webupdate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {


    public TestController() {
        System.out.println("controller init");
    }

    @GetMapping("/test")
    @ResponseBody
    public String get() {
        System.out.println("success");
        return "success";
    }

    /**
     * 未配置json的情况下，这个接口无法生效
     * @return
     */
    @GetMapping("/testMap")
    @ResponseBody
    public Map<String,String> getMap() {
        System.out.println("map success");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a","aa");
        return map;
    }
}
