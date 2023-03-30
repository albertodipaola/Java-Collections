public class PepoleKey{
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.cf==null ? 0 : this.cf.hashCode());
        result = prime * result + this.progressivo;
        return result;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        PepoleKey pk = (PepoleKey)o;
        if (this.cf == null) {
            if (pk.cf != null) {
                return false;
            }
            else if (!this.cf.equals(pk.cf)) {
                return false;
            }
        }
        if(this.progressivo != pk.progressivo) return false;
        
        return true;
    }
}
