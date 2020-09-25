package top.huxiaohu.slog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/topic")
@Slf4j(topic = "test")
public class TestTopicController {

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
