package StaticAnalysisVSSL;

public class DisjunctionState implements State {

    private State left;
    private State right;

    public DisjunctionState(State left, State right){
        this.left = left;
        this.right = right;
    }

    @Override
    public ValueSet valuesOf(String variableName) {
        return null;
    }

    @Override
    public boolean subStateOf(State other) {
        if(left.disjunctionOf(other) != right.disjunctionOf(other)){
            return true;
        }
        return false;
    }
}
