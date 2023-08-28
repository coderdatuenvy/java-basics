package doctor;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff, BeanNameAware
{
//    Doctor(String qualification){
//        this.qualification = qualification;
//    }
    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    private String qualification;
    public void assist(){
        System.out.println("doctor is currently assisting ...");

    }

    @Override
    public void setBeanName(String s) {

    }
}
