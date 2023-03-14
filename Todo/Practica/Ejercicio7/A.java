public class A {
	public void actionOne() {
		System.out.println("a");
	}
	
	public void actionTwo() {
		this.actionOne();
	}
}