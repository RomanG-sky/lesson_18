package lgs.lviv.ua;

public class GenericList<T,V> {
T ob1;
V ob2;
public GenericList(T ob1, V ob2) {
	super();
	this.ob1 = ob1;
	this.ob2 = ob2;
}
public T getOb1() {
	return ob1;
}
public void setOb1(T ob1) {
	this.ob1 = ob1;
}
public V getOb2() {
	return ob2;
}
public void setOb2(V ob2) {
	this.ob2 = ob2;
}
@Override
public String toString() {
	return "GenericList [ob1=" + ob1 + ", ob2=" + ob2 + "]";
}
public void ShowClass() {
	System.out.println("Type of T " +ob1.getClass());
	System.out.println( "Type of V " + ob2.getClass());
}

}
