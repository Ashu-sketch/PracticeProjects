package EdurekaSpringSession.com.edurekaSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      ApplicationContext CTX= new ClassPathXmlApplicationContext("EmployeeBean.xml");
//     Employee emp= CTX.getBean("e1", Employee.class);
//     System.out.println(emp);
    	Resource resource =new  ClassPathResource("");
    	
    }
}
