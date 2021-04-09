package StaticAnalysisVSSL;

public class ConjunctionState implements State {

    private State left;
    private State right;

    public ConjunctionState(State left, State right){
        this.left = left;
        this.right = right;
    }

    //Condition 8..16
    @Override
    public ValueSet valuesOf(String variableName) {
        return null;
    }

    @Override
    public boolean subStateOf(State other) {
        if (left.conjunctionOf(other) == right.conjunctionOf(other)){
            return true;
        }
        return false;
        }
}
