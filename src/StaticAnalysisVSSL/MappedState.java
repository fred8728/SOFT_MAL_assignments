package StaticAnalysisVSSL;

import java.util.HashMap;
import java.util.Map;

public class MappedState implements State{
    private Map<String, ValueSet> variables = new HashMap<>();

    public MappedState(){ }

    public void put (String variableName, ValueSet valueSet){
        variables.put(variableName, valueSet);
    }

    public void put (String variableName){
        variables.put(variableName, null);
    }

    @Override
    public ValueSet valuesOf(String variableName) {
        return variables.get(variableName);
    }

    @Override
    public boolean subStateOf(State other) {
        if (other instanceof MappedState) {
            MappedState mapped = (MappedState)other;
            for (String variableName : mapped.variables.keySet()) {
                ValueSet thisVariable = variables.get(variableName);
                if (thisVariable == null) return false;
                ValueSet otherVariable = mapped.variables.get(variableName);
                return thisVariable.subsetOf(otherVariable);
            }
        }
        return false;
    }
}
