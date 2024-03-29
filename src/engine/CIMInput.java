package engine;

public class CIMInput {
    private int n;
    private int l; // Board size: L x L
    private int m; // Field size: M x M
    private double rC; // Interaction radius for each particle
    private double r; // Fixed radius for each particle

    public CIMInput(final int n, final int l, final int m, final double rC, final double r) {
        if (r > rC) {
            throw new IllegalArgumentException("The interaction radius between particles " +
                "must be greater than their radius");
        }

        this.setN(n);
        this.setL(l);
        this.setM(m);
        this.setRC(rC);
        this.setR(r);
    }

    public int getN() {
        return n;
    }

    private void setN(final int n) {
        this.n = n;
    }

    public int getL() {
        return l;
    }

    private void setL(final int l) {
        this.l = l;
    }

    public int getM() {
        return m;
    }

    private void setM(final int m) {
        this.m = m;
    }

    public double getRC() {
        return rC;
    }

    private void setRC(final double rC) {
        this.rC = rC;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}