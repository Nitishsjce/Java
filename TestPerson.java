import java.util.ArrayList;

public class TestPerson
{
  public static void main(String[] args)
  {
    Person p1 = new Person("Hippo",5);
    Person p2 = new Person("Hippo",5);
    System.out.println("identity check = "+(p1==p2));
    System.out.println("identity check = "+(p1.equals(p2)));
    System.out.println(p1);
    System.out.println(p2);
    ArrayList al = new ArrayList();
    al.add(p1);
    System.out.println("is it2 present in col = "+al.contains(p1));
    System.out.println(al);
	al.remove(p1);
	System.out.println(al);
  }
}
