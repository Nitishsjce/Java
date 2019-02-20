import java.util.*;

public class Person
{
  String name;
  int height;
  public Person(String name,int height)
  {
    //super();
    this.name = name;
    this.height = height;
  }
  public boolean equals(Object o)
  {
    if(o instanceof Person)
    {
      Person p = (Person)o;
      if(this.name.equals(p.name) && this.height == p.height)
        return true;
      else
        return false;
    }
    else
      return false;
  }
  public String toString()
  {
    return "person " + name + "," +height;
  }
  
}

/*
public class Person {
	private String name;
	private String email;
	public Person() {
		System.out.println("HI");
	}
	public Person(String name,String email)
	{
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/
