package TapAcedmy.BitManipulation;

public class reverseWord {
public static void main(String[] args) {
	String s="my name is komal";
	char[] c=s.toCharArray();
	//
	//komal is name my
	int n=s.length();
	for(int i=0;i<s.length(); i++) {
		for(int j=0; j<s.length(); j++) {
			System.out.print(c[j]);
		if(c[j]!=' ') {
			c[n-1-i]=c[j];
		}
		}
	}
	//for(char c1:c) System.out.print(c1);
}
}
