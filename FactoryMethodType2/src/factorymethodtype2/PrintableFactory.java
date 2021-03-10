package factorymethodtype2;

public class PrintableFactory {
public static Printable getPrintable() {
	return new A();
}
}
