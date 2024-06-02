import java.io.Serializable;

public class REL implements Cloneable, Serializable {
    public int R;
    public int E;
    public int L;

    public REL clone() throws CloneNotSupportedException {
        return (REL) super.clone();
    }

    public REL(int R, int E, int L) {
        this.R = R;
        this.E = E;
        this.L = L;
    }

    public String toString() {
        return "R=" + R + " E=" + E + " L=" + L;
    }

}
