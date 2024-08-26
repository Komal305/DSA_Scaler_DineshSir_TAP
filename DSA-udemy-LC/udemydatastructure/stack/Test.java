package udemydatastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
//	1.Create a list of type user and filter only users with age>20
//	 
//	classname-user
//	variable attributes of user- name(String),age(int)
	
List<User> ans=new ArrayList<User>();
ans.add(new User("komal", 25));
ans.add(new User("komal", 11));
ans.add(new User("komal", 19));

List<User> list=new ArrayList<>();
for(User u:ans) {
if(u.age>20) list.add(u);
}

for(User u:list) System.out.print(u.getName());



}
}
