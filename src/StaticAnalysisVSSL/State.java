package StaticAnalysisVSSL;

public interface State {

    ValueSet valuesOf(String variableName); // x=(7..11)
    boolean subStateOf(State other); // gives partially order

    default State conjunctionOf(State other) { // and
        return new ConjunctionState(this, other);
    }
    default State disjunctionOf(State other) { // or
        return new DisjunctionState(this, other);
    }
}
