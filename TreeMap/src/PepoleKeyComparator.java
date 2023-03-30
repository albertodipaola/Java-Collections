import java.util.Comparator;

public class PepoleKeyComparator implements Comparator<PepoleKey> {

    @Override
    public int compare(PepoleKey o1, PepoleKey o2) {
        return o1.getProgressivo() - o2.getProgressivo();
    }
    
}
