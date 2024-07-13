package Com;

public class Pattern {
	    public static void main(String[] args) {
	        int rows = 4;
	        int cols = 4;
	        int rowss=3;
	        int colm=3;
	        printHexagonPattern(rows, cols);
	        printHexagonPattern(rowss, colm);
	    }

	    public static void printHexagonPattern(int rows, int cols) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("  ____     ");
	                if (j < cols - 1) System.out.print("");
	            }
	            System.out.println();
	            for (int j = 0; j < cols; j++) {
	                System.out.print(" /    \\    ");
	                if (j < cols - 1) System.out.print("");
	            }
	            System.out.println();
	            for (int j = 0; j < cols; j++) {
	                System.out.print("/      \\___");
	                if (j < cols - 1) System.out.print("");
	            }
	            System.out.println();
	            for (int j = 0; j < cols; j++) {
	                System.out.print("\\      /   ");
	                if (j < cols - 1) System.out.print("");
	            }
	            System.out.println();
	            for (int j = 0; j < cols; j++) {
	                System.out.print(" \\____/    ");
	                if (j < cols - 1) System.out.print("");
	            }
	            System.out.println();
	        }
	    }
	}

