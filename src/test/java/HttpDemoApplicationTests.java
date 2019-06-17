
import com.feige.pojo.User;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.client.RestTemplate;


public class HttpDemoApplicationTests {


         @Test
         public void httpGet(){
             RestTemplate restTemplate=new RestTemplate();
             User user = restTemplate.getForObject("http://127.0.0.1:8080/getUser", User.class);
             System.out.println(user.getUsername());
         }
}
