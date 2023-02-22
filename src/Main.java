import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chr.IoC.BossEmployee;
import com.chr.IoC.DirectorEmploye;
import com.chr.IoC.Employe;
import com.chr.IoC.SecretaryEmploye;

public class Main {
    public static void main(String[] args) {

        //Creacion de objetos de tipo empleado
        /* Employe bossEmploye1 = new DirectorEmploye();
        System.out.println(bossEmploye1.getTasks()); */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Employe crisandro= context.getBean("employe", Employe.class);
        System.out.println(crisandro.getTasks());
        System.out.println(crisandro.getReport());*/
        BossEmployee jefe = context.getBean("bossEmployeBean", BossEmployee.class);
        System.out.println(jefe.getTasks());
        System.out.println(jefe.getReport());
        System.out.println(jefe.getCompanyName());
        System.out.println(jefe.getEmail());

        SecretaryEmploye secretario = context.getBean("employeBean", SecretaryEmploye.class);
        System.out.println(secretario.getTasks());
        System.out.println(secretario.getCompanyName());
        System.out.println(secretario.getEmail());

        context.close();

    }
    
}