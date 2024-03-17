package paquete;

public class TablaDel1al10 {
	public static void main(String[] args) {
		int[][] array = new int[11][11];

		int multi = 0;

		for (int i = 1; i < array.length; i++) {
			System.out.println();
			multi = 0;
			for (int j = 0; j < array.length; j++) {
				array[i][j] = i * multi++;
				System.out.print(array[i][j] + "\t");
			}
		}
	}
}
