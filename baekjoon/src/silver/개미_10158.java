package silver;

import java.io.FileInputStream;
import java.util.Scanner;

public class 개미_10158 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int t = sc.nextInt();
		
		int x = (p+t)%(2*w);
		int y = (q+t)%(2*h);
		
		if(x>w) x = 2*w - x;
		if(y>h) y = 2*h - y;
		
		System.out.println(x + " " + y);
	}
}
