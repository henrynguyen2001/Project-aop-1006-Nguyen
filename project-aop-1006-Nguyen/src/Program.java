
public class Program {
	public static void main(String[] args) {
		ComponentApp componentApp = new ComponentApp("COM");
		DataApp dataApp = new DataApp("DATA");
		ServiceApp serviceApp = new ServiceApp("SRC");
		
		String comName = componentApp.getname();
		System.out.println("  COM NAMEL " + comName);
		
		String dataName = dataApp.getname();
		System.out.println("  DAT NAME: " + dataName);
		
		String srcName = serviceApp.getname();
		System.out.println("  SRC NAME: " + srcName);
	}
}
