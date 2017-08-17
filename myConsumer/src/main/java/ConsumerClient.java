import com.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        String result = helloService.speakHello("高海洋");
        System.out.println(result);
    }
}
