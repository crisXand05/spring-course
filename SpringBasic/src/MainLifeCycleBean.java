import com.chr.IoC.Employe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeCycleBean {

    public static void main(String[] args){
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("applicationContextLifeCycleBean.xml");
        Employe empleado = cx.getBean("bossEmployeBean", Employe.class);
        System.out.println(empleado.getReport());
        cx.close();
    }
}
