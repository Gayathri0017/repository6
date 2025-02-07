public class user{
public static void main(String args[]) {
if(args.length<2){
System.out.println("Usage: java parameterInput <name> <age>");
return;
}
String name=args[0];
int age=Integer.parseInt(args[1]);
System.out.println("Name:"+name);
System.out.println("Age:"+age);
}
}

