package AfterProxy;

public class PrinterProxy implements Printable {
	private String name;
	private Printer real;
	
	public PrinterProxy() {
		this.name = "no name";
		this.real = null;
	}
	
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}
	
	@Override
	public void setPrinterName(String name) {
		if(real != null) {
			real.setPrinterName(name);
		}else {
			this.name = name;
		}
		
	}

	@Override
	public void getPrinterName() {
		System.out.println("the real is " + real );
		System.out.println("The current name is \"" + this.name + "\"");
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	// 본인 생성
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
	
}
