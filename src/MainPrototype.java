import com.chr.IoC.SecretaryEmploye;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrototype {

    public static void main(String[] args){
        ClassPathXmlApplicationContext cntx = new ClassPathXmlApplicationContext("applicationContextPrototype.xml");
        SecretaryEmploye juan = cntx.getBean("employeBean", SecretaryEmploye.class);
        SecretaryEmploye jose = cntx.getBean("employeBean", SecretaryEmploye.class);
        System.out.println(juan);
        System.out.println(jose);
        juan.setCode("c0001");
        if(juan == jose) System.out.println("Apuntan al mismo objeto");
        else System.out.println("No apuntan al mismo objeto");
        System.out.println(jose.getCode()); //Imprime null si es prototype
        cntx.close();
    }
}
