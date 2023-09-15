public class BitOperator {
	
	public static void main(String[]  args) {
		
		int a = 10, b = 15, c = 13;
		
		System.out.println("AND operation " + (a & b));
		
		System.out.println();
		
		System.out.println("OR operation " + (a | b));
		
		System.out.println();
		
		System.out.println("XOR operation " + (a ^ b));
		
		System.out.println();
		
		System.out.println("AND with one operation " + (a & 1));
		
		System.out.println();
		
		System.out.println("OR with one operation " + (a | 1));
		
		System.out.println();
		
		System.out.println("Bitwise Right Shift: " + (a >> 1));
		
		System.out.println();
		
		System.out.println("Bitwise Right Shift: " + (a >> 2));
		
		System.out.println();
		
		System.out.println("Bitwise Right Shift: " + (a << 1));
		
		System.out.println();
		
	}
}
