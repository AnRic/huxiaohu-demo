package top.huxiaohu.slog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @RequestMapping("info")
    public String info(String content) {
        log.info("================  info test  =============");
        return "info";
    }

    @RequestMapping("error")
    public String error(String content) {
        log.error("================  error test  =============");
        return "error";
    }

}
