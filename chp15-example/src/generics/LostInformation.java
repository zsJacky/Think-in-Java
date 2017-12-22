package generics;

import java.util.*;

class Forb {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTIUM> {}

public class LostInformation {
	public static void main(String[] args) {
		List<Forb> list = new ArrayList<Forb>();
		Map<Forb, Fnorkle> map = new HashMap<Forb, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		System.out.println(Arrays.toString(
			list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
			map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
			quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
			p.getClass().getTypeParameters()));
	}
}
