package controlStatement;

public class jumpStatement {
    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 25; i += 2) {
            if (i == 7 || i == 11 || i == 17) {
                continue;
            }
            if (i == 25) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
            
            
        }
    }
}
