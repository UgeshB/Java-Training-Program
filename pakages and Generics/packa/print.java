package packa;

public interface print {
	public int add(int a,int b);
	public default int back(int a) {
		System.out.println(a);
		return a;
	}
}
