package lgs.lviv.ua;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyMap<K, V> extends MyEntry<K, V> {

	private LinkedHashMap<K, V> mymap;

	public MyMap(K k, V v) {
		super(k, v);
		this.mymap = new LinkedHashMap<K, V>();
		this.mymap.put(k, v);
	}

	public void addObject(K k, V v) {
		mymap.put(k, v);
	}

	public void delObjectKey(K k) {
		mymap.remove(k);
	}

	public void delObjectValue(V v) {

		Iterator<Entry<K, V>> iterator = mymap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = (Entry<K, V>) iterator.next();

			if (next.getValue().equals(v)) {
				iterator.remove();
			}
		}
	}

	public void showKeys() {

		Iterator<Entry<K, V>> iterator = mymap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = (Entry<K, V>) iterator.next();

			System.out.println(next.getKey().toString());
		}

		System.out.println();
	}

	public void showValues() {

		Iterator<Entry<K, V>> iterator = mymap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = (Entry<K, V>) iterator.next();

			System.out.println(next.getValue().toString());
		}

		System.out.println();
	}

	public void showMap() {

		Iterator<Entry<K, V>> iterator = mymap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = (Entry<K, V>) iterator.next();

			System.out.println(next.getKey().toString() + " " + next.getValue().toString());
		}

		System.out.println();
	}

}
