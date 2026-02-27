class Single
{
private String name;
Single()
{
System.out.println("Constructor called:");
name="JAVA Programming";
}
public static void main(String[] args)
{
Single obj=new Single();
System.out.println("This is "+obj.name);
}
}
