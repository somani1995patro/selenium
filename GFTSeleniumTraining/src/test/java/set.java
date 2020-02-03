import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class set {
	@Test
       public void add()
       {
    	 Set<String> s=new HashSet<String>();
    	 System.out.println(s.size());
    	 s.add("india");
    	 s.add("california");
    	 s.add("rome");
    	 s.add("palenstine");
    	 System.out.println(s.size());
    	 Iterator<String> it=s.iterator();
    	 System.out.println(it.next());
    	 System.out.println(it.next()); 
    	 System.out.println(it.next());
    	 System.out.println(it.next()); 
       }
}
