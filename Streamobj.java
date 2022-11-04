package CoreJava;

import java.util.ArrayList;

class Students{
	private String Name;
	private int Id;
	private String Techstack;
	
	public String getTechstack() {
		return Techstack;
	}
	public Students(String name, int id, String techstack) 
	{
		Name = name;
		Id = id;
		Techstack = techstack;
	}
	@Override
	public String toString() {
		return "Students [Name=" + Name + ", Id=" + Id + ", Techstack=" + Techstack + "]";
	}
}

public class Streamobj {

	public static void main(String[] args) {
		ArrayList<Students> al=new ArrayList<>();
		al.add(new Students("Ash",122,"Java"));
		al.add(new Students("John",567,"Mern"));
		al.add(new Students("Pol",903,"Java"));
		al.add(new Students("Brock",901,"Python"));
		
		al.stream().filter(n->n.getTechstack().equals("Java")).forEach(e->System.out.println(e));

	}

}
