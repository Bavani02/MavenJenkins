package String;

public class StringManipulation {

	public static void main(String[] args) {

		String str="The rains have started here";
		String str1="The rains Have started here";



		System.out.println(str.length());

		System.out.println(str.charAt(6));

		System.out.println(str.indexOf('s'));// 1st occurrence

		System.out.println(str.indexOf('s', str.indexOf('s')));//2nd occurrence

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("hello"));

		//String comparison
		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));

		//substring
		System.out.println(str.substring(0, 11));

		//trim
		String s="      Hello     ";
		System.out.println(s.trim());

		//replace
		String date="07-02-2018";
		System.out.println(date.replace("-", "/"));

		//split
		String value="Automation_Selenium_Tester_Using_java";
		String testValue[]=value.split("_");
		for(int i=0; i<testValue.length;i++)
		{
			System.out.println(testValue[i]);
		}

		//concat
		String s2="Youtub";
		System.out.println(s2.concat("e"));

		String x="Welcome";
		String y="World";
		int a=100;
		int b=500;

		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));

		String t="Test";
		System.out.println(t.contains(s2));

		/*String firstName = "Tom;Naveen;Felix;Ipsi;Sharmi";
		String firstName1[] = firstName.split(";");
		for(int i=0; i<firstName1.length; i++){
			System.out.println(firstName1[i]);*/

			String h = "XxTestXxTestXxXtesting";
			String d[] = h.split("Xx");
			for(int j=0; j<d.length; j++){
				System.out.println(j+"-->"+d[j]);
			}

		}
	}


