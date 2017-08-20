// a Map implemented with ArrayList

package containers;

import java.util.*;
import net.mindview.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	public V put(K key, V value) {
		V oldValue = get(key);	// the old value or null
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	public V get(Object key) {	// key is type Object, not k
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext())
			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		return set;
	}
}
