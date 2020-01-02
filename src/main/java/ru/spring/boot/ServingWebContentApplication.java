package ru.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// If want to move that Class from /boot folder to other package It needs to uncomment all annotation

@SpringBootApplication
//@ComponentScan("ru.spring.boot")
//@EntityScan("ru.spring.boot.dao")
//@EnableJpaRepositories("ru.spring.boot.dao")
public class ServingWebContentApplication {

    //https://o7planning.org/ru/11661/spring-boot-jpa-and-spring-transaction-tutorial  В самом низу там Thymeleaf применры
    //https://stackoverflow.com/questions/30870146/transactional-annotation-not-working-in-spring-boot
    //https://www.youtube.com/watch?v=nyFLX3q3poY
    
    //http://localhost:8080/foos/abc PathVariable
    //http://localhost:8080/foos?id=abc @RequestParam

    //RestController если использовать, то это аналог Controller и добавляет ResponseBody к каждому методу
//ResponseBody если отдавать оьъект, то нужно отдавать в виде json, а на фронте этот json парсить

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

   /* @Bean
    public LocaleResolver localeResolver(){
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return  localeResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(localeChangeInterceptor());
    }*/

}
