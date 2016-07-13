import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main { 

    public static void main(String[] args) {
        log.trace("This is a trace");
        log.debug("This is a debug");
        log.info("This is an info");
        log.error("This is an error");
        log.fatal("This is a fatal");
        new TestDebug().test();
        new TestError().test();
    }
}


@Log4j2
class TestDebug {
    
    void test() {
        log.debug("this is a test debug log");
        log.error("this is a test error log");
    }
}

@Log4j2
class TestError {
    
    void test() {
        log.debug("this is a test debug log");
        log.error("this is a test error log");
    }

}
