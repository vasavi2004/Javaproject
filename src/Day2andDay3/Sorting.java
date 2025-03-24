package Day2andDay3;
	import java.util.*;

	class Student {
	    String name;
	    int marks;
	    
	    public Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	    
	    @Override
	    public String toString() {
	        return name + " - " + marks;
	    }
	}

	public class Sorting {
	    public static void main(String[] args) {
	        List<Student> students = Arrays.asList(
	            new Student("Alice", 85),
	            new Student("Bob", 90),
	            new Student("Charlie", 78)
	        );
	        
	        // Using an anonymous inner class to implement Comparator
	        Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return Integer.compare(s2.marks, s1.marks); // Sorting in descending order
	            }
	        });
	        
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}

