package pac.demo;

import java.util.Objects;


public class Demo {
	int id;
	String name;
	int jno;
	public Demo(){
	
	}
	public Demo(int id, String name, int jno) {
		super();
		this.id = id;
		this.name = name;
		this.jno = jno;
		
	}
	
	
	public String toString()
	{
		return "[id :"+this.id+", name : "+this.name+", jno : "+this.jno+"]";
		
	}
	
	
	
	
	
	public boolean equals(Demo d) {
		if(this.id == d.id) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return Objects.hash(id,name,jno);
	}
	
	

}
