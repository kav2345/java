***
full reverse the string
output:
gninrom doog olleh
***
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="hello good morning";
		String[] s=words.split(" ");
		for(int i=words.length()-1;i>=0;i--) {
			char ch=words.charAt(i);
			System.out.print(ch);
		}

	}

}
***
