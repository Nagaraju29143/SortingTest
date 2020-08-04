import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {

		Employee e1=new Employee("nag",30);
		Employee e2=new Employee("test",29);
		Employee e3=new Employee("sai",25);
		Employee e4=new Employee("ram",9);
		Employee e5=new Employee("hari",29);
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
		
		
        Collections.sort(empList, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));

        empList.stream().filter(e->e.getAge()>=10).map(Employee::getName).forEach(System.out::println);
        
	}

}
