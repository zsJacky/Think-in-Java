package annotations;

import net.mindview.util.*;

public class Testable {
	public void execute() {
		System.out.println("Executing...");
	}
	@Test void testExecute() { execute(); }
}
