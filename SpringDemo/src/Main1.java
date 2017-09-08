import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main1 {
	public static void main(String[] args) {
		ClassPathResource r = new ClassPathResource("inject.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Person p = (Person) bf.getBean("Person");
		System.out.println(p.name);
	}
}
