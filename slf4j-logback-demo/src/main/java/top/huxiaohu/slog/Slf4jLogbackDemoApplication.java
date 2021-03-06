package top.huxiaohu.slog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Slf4jLogbackDemoApplication {

    public static void main(String[] args) {
        log.info("=============  start log demo  ==============");
        SpringApplication.run(Slf4jLogbackDemoApplication.class, args);
        log.trace("============  test trace ==========================");
        log.debug("============  test debug ==========================");
        log.info("============  test info ==========================");
        log.warn("============  test warn ==========================");
        log.error("============  test error ==========================");
        log.info("=============  start log demo success ==============");
    }
}
