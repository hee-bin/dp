package AfterProxy;

/**
 * 프린터 본인을 나타내는 클래스입니다.
 */

public class Printer implements Printable {
	
	private String name;
	
	public Printer() {
		heavyjob("On Production an instance");
	}
	
	public Printer(String name) {
		this.name = name;
		
	}

	
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public void getPrinterName() {
		System.out.println("The current name is  \"" + this.name + "\"");
	}

	@Override
	public void print(String string) {
		System.out.println("===[" + name + "\'s print]===");
		System.out.println(string);
	}
	
	
	// 무거운 작업이라고 가정
	private void heavyjob(String msg) {
		System.out.println(msg);
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
			System.out.println(".");
		}
		System.out.println("done");
	}
}
