import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {

		/*Employee e1=new Employee("nag",30);
		Employee e2=new Employee("test",29);
		Employee e3=new Employee("sai",25);
		Employee e4=new Employee("ram",9);
		Employee e5=new Employee("hari",29);
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
		
		
        Collections.sort(empList, Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));

        empList.stream().filter(e->e.getAge()>=10).map(Employee::getName).forEach(System.out::println);*/
        
        Map<Character,String> hm=new HashMap<>();
        hm.put('A',"Amazon");
        hm.put('D',"Deloitee");
        hm.put('B',"Boieng");
        hm.put('F',"Flipcart");
		
		Character[] input= {'D','A','B'};
	    List<String> list=new ArrayList<>();
		 
	    Arrays.stream(input).forEach(c->{
	    String  str= hm.entrySet().stream()
			    .filter(e->e.getKey().equals(c))
			    .map(Map.Entry::getValue)
			    .collect(Collectors.joining(","));
			
			     list.add(str);
	    });
		
		list.stream().sorted(Comparator.comparing(String::toString)).forEach(System.out::println);
        
	}

}
