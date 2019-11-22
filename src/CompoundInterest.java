import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interestRate = new double[NRATES];
        for (int i=0; i<interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100;
        }

        double[][] balances = new double[NYEARS][NRATES];
        for (int i=0; i<balances[0].length; i++) {
            balances[0][i] = 10000;
        }

        // Calculate the future value;
        for (int i=1; i<balances.length; i++) {
            for (int j=0; j<balances[0].length; j++){
                balances[i][j] = balances[i-1][j] * (1 + interestRate[j]);
            }
        }

        //System.out.println(Arrays.deepToString(balances));

        for( int i=0; i<interestRate.length; i++) {
            System.out.printf("%9.0f%%", interestRate[i]*100);
        }
        System.out.println();

        for (double[] row : balances) {
            for(double balance : row) {
                System.out.printf("%10.2f", balance);
            }
            System.out.println();
        }
    }
}
