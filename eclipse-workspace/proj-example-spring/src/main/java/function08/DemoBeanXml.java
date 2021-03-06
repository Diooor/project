package function08;

public class DemoBeanXml {
	public void method1() {
		System.out.println("calling DemoBeanXml.method1(): field1="+field1+", field2="+field2);
	}
	public void method2() {
		System.out.println("calling DemoBeanXml.method2()");
	}
	
	private String field1;
	public DemoBeanXml(String field1) {
		System.out.println("create DemoBeanXml(String)");
		this.field1 = field1;
	}
	private int field2;
	public void setField2(int field2) {
		System.out.println("calling setField2(int)");
		this.field2 = field2;
	}
}
