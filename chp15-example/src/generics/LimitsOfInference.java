package generics;

import java.util.*;
import typeinfo.pets.*;
import net.mindview.util.*;

public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.map());
	}
}
