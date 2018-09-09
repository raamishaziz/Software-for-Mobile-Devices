import java.io.EOFException;

interface A{  
void Gs();

          }  

interface B{
void name();
           }
 
abstract class tennisPlayer{  

	abstract void rank();
	abstract void age();
	
  void show()
  {
	  System.out.println("I am a Tennis player");
  }
}  
  

class Federer extends tennisPlayer implements A,B {  

void rank() {
	 System.out.println("I am ranked no 2 in the world");
}
void age(){
	 System.out.println("I am 37 years old");
}  
public void name()
{
	 System.out.println("Federer");
}
public void Gs()
{
	 System.out.println("Grand slams won = 20");
}

static class StudentsofFederer {
	
		//static nested class to implement students of federer.
}  

}
class Nadal extends tennisPlayer implements A,B{


void rank() {
	 System.out.println("I am ranked no 1 in the world");
}

void age() {
	 System.out.println("I am 32 years old");
} 
public void name()
{
	 System.out.println("Nadal");
}
public void Gs()
{
	 System.out.println("Grand slams won = 17");
}
}
  
class Test5{  
	
public static void main(String args[]) throws ClassNotFoundException, EOFException{   //checked exeption
	Federer fed = new Federer();
	Nadal nad = new Nadal();
	fed.name();
	fed.show();
	fed.rank();
	fed.age();
	fed.Gs();
	nad.name();
	nad.show();
	nad.rank();
	nad.age();
	nad.Gs();

}}