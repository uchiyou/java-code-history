package uu.fanxin;

public class Tools<K>{
	private K kind;

	public K getKind() {
		return kind;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}
	public void show(){
		//System.out.println( kind).getName());
		System.out.println("contains "+kind);
	}

}
