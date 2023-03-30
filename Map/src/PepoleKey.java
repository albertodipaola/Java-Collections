public class PepoleKey {
    private String cf;
    private int progressivo;
    
    public PepoleKey(String cf, int progressivo) {
        this.cf = cf;
        this.progressivo = progressivo;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public int getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(int progressivo) {
        this.progressivo = progressivo;
    }
}
