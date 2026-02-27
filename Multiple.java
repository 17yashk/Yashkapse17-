class Multiple
{
String language;
Multiple()
{

this.language = "java";
}
Multiple(String language)
{
this.language=language;
}
public void getName()
{
System.out.println("Programming Language:"+this.language);
}
public static void main(String[] args)
{
Multiple obj1 = new Multiple();
Multiple obj2 = new Multiple("Python");
obj1.getName();
obj2.getName();
}
}
