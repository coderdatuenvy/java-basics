package doctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        for XML and and context component scan
        ApplicationContext appcon = new ClassPathXmlApplicationContext("spring.xml");

//        for BeanConfig meaning configuring bean through a java class
      //  ApplicationContext appcon = new AnnotationConfigApplicat ionContext(BeanConfig.class);
        Doctor doc = appcon.getBean(Doctor.class);
        doc.assist();
        System.out.println("qualification of the assigned doctor :" + doc.getQualification());
    }
}
