package listandtabledemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

	private List<Student> students= new ArrayList<>();
	
	public StudentDataUtil() {
		loadSampleData();
	}
	
	public void loadSampleData() {
		students.add(new Student("Ahmed", "Algebali", "ahmedelgebalywork@gmail.com"));
		students.add(new Student("Mohamed", "Algebali", "mohamedelgebalywork@gmail.com"));
		students.add(new Student("Hamdy", "Algebali", "hamdyelgebalywork@gmail.com"));
	}

	public List<Student> getStudents() {
		return students;
	}
}
