package doctor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//basically what the above code did is what context:componenet-scan did in spring.xml as it doesnt need toscans the
// packages for classes who has @Component tag above them we can remove @Component and just in the clss below
// annote the obj return type function w/ @Bean and becomes the bean no need for XML <bean tag or @component tag
//@Configuration
@ComponentScan(basePackages = "doctor")
public class BeanConfig {
//WHATEVER FUNCTION WE ANNOTATE AS A BEAN WILL BE CALLED WHILE LOADING BEANS BY JAVA
//    @Bean
//    public Doctor doc(){
//    return  new Doctor("MBBS");
//    }

}

