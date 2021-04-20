import java.util.ArrayList;

public class Series<E> {
	private String name;
	private ArrayList<E> column;
	
	public Series() {
		this.name = "";
		this.column = new ArrayList<E>();
	}
	
	public Series(String name) {
		this.name = "";
		this.column = new ArrayList<E>();
	}
	
	public Series(String name, ArrayList<E> l) {
		this.name = "";
		this.column = l;
	}
	
	public ArrayList<E> getColumn() {
		return this.column;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setColumn(ArrayList<E> column) {
		this.column = column;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void add(E elem) {
		this.column.add(elem);
	}
	
	public E getElem(int indice) {
		return this.column.get(indice);
	}
	
	public int getSize() {
		return this.column.size();
	}
}