package nested;


public class CallNested {
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		//ClassName.innerClassName obj 
		// = ObjectNameofMainClass.new InnerClass();
		NestedClass.Inner nc1 = nc.new Inner();
		nc1.walk();
		
		
	}

}
