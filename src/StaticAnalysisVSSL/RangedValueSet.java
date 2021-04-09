package StaticAnalysisVSSL;

public class RangedValueSet implements ValueSet{
    private boolean mightBeUndefined;
    private int floor;
    private int roof;

    public RangedValueSet(boolean mightBeUndefined, int floor, int roof) {
        this.mightBeUndefined = mightBeUndefined;
        this.floor = floor;
        this.roof = roof;
    }

    @Override
    public boolean canBeUndefined() {
        return mightBeUndefined;
    }

    @Override
    public boolean contains(int value) {
        return floor <= value && value < roof;
    }

    public boolean subsetOf(ValueSet valueSet) {
        if (valueSet instanceof RangedValueSet) {
            RangedValueSet other = (RangedValueSet)valueSet;
            if (this.mightBeUndefined && !other.mightBeUndefined) return false;
            if (other.floor <= this.floor && this.roof <= other.roof) return true;
        }
        return false;
    }

}
