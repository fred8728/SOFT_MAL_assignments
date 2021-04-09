package StaticAnalysisVSSL;

public class Analysis implements SyntaxTree {

    // condition = 8..16
    @Override
    public State analyse(State condition) {
        return condition;
    }
}
