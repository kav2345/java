***
encapsulation
outut:
rocky
black
18000
7
rotweiler
***
public class dog {
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	public void setname(String name)
	{
		this .name=name;
	}
	public String getname() {
		return name;
	}
	public void setcolor(String color)
	{
		this .color=color;
	}
	public String getcolor() {
		return color;
	}
	public void setcost(int cost)
	{
		this .cost=cost;
	}
	public int getcost() {
		return cost;
	}
	public void setage(int age)
	{
		this .age=age;
	}
	public int getage() {
		return age;
	}
	public void setbreed(String breed)
	{
		this .breed=breed;
	}
	public String getbreed() {
		return breed;
	}
}

public class start {
	public static void main(String args[]) {
		dog d=new dog();
		d.setname("rocky");
		d.setcolor("black");
		d.setcost(18000);
		d.setage(7);
		d.setbreed("rotweiler");
		System.out.println(d.getname());
		System.out.println(d.getcolor());
		System.out.println(d.getcost());
		System.out.println(d.getage());
		System.out.println(d.getbreed());
	}
}
****
