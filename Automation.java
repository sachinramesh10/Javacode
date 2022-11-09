package seleniumTasks;

public class Automation extends MultipleLanguage implements TestTool,Language {

	public static void main(String[] args) {
		
		Automation obj =new Automation();
		obj.python();
		obj.ruby();
		obj.java();
		

	}

	@Override
	public void python() {
		System.out.println("This Method is from Abstract class");
		
	}

	public void selenium() {
		System.out.println("This Method is from Concrete class");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
	}

}
