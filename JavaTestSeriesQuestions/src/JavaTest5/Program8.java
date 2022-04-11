package JavaTest5;

/*8.	How to remove Characters from the first String which are present in the second
String.
e.g String1-&gt;india is great nation.
string2-in
output-&gt;da s great
*/
public class Program8 {

	public static void main(String[] args) {
		String s1 = "India is great nation";
		s1 = s1.toLowerCase();
		String s2 = "in";
		String s3 = "";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == ch[i]) {
					ch[i] = ' ';
				}
				
			}
			if (ch[i] != ' ') {
				s3 = s3 + ch[i];
			}
		}
	//	System.out.println(s3);
		             //OR
		String str=new String(ch);
		System.out.println(str);

	}

}
