package AfterProxy;

public class main {

	public static void main(String[] args) {
		Printable p = new PrinterProxy();
		p.getPrinterName();
		p.setPrinterName("heebin");
		p.getPrinterName();
		
		p.print("hello");
		p.getPrinterName();
		
		
		
		

	}

}

