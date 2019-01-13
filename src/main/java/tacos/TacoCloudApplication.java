package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication   // <1>
public class TacoCloudApplication implements WebMvcConfigurer {

  public static void main(String[] args) {
    System.out.println("call TacoCloudApplication:main()");
    SpringApplication.run(TacoCloudApplication.class, args); // <2>
  }

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("home");
  }
}
