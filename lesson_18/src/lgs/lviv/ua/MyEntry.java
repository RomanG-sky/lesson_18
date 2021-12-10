package lgs.lviv.ua;

	public class MyEntry<K, V> {
		  
		  private final K key;
		  private final V value;

		  public MyEntry(K k,V v) {  
		    key = k;
		    value = v;   
		  }

		  public K getKey() {
		    return key;
		  }

		  public V getValue() {
		    return value;
		  }

		  public String toString() { 
		    return "(" + key + ", " + value + ")";  
		  }
		}

