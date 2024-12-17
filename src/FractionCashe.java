public class FractionCashe implements FractionProperties{
    private final Fraction fraction;
    private Double cachedValue;

    public FractionCashe(Fraction fraction) {
        this.fraction = fraction;
        this.cachedValue = null;
    }

    public double getValue() {
        if (cachedValue == null) {
            cachedValue = (double) (fraction.getNumerator()/fraction.getDenominator());
        }
        return cachedValue;
    }

    @Override
    public void setNumerator(int numerator) {
        fraction.setNumerator(numerator);
        cachedValue = null;
    }

    @Override
    public void setDenominator(int denominator) {
        fraction.setDenominator(denominator);
        cachedValue = null;
    }

    @Override
    public String toString() {
        return fraction.toString();
    }
}