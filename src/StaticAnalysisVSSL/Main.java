package StaticAnalysisVSSL;public class Main {

    public static void main(String[] args) {

        //Some valueset
        RangedValueSet value1 = new RangedValueSet(false, 12, 16);
        RangedValueSet value2 = new RangedValueSet(false, 8, 20);
        RangedValueSet value3 = new RangedValueSet(false, 13, 14);

        // Trying to see if subsetOf
        System.out.println("Should return true: " + value1.subsetOf(value2)); // 12..16 is subset of 8..16
        System.out.println("Should return false: " + value2.subsetOf(value1)); // 8..16 is subset of 12..16
        System.out.println("Should return true: " + value3.subsetOf(value1)); // 13..14 is subset of 12..16

        // Adding some states
        MappedState ms = new MappedState();
        ms.put("x", value1);

        MappedState ms1 = new MappedState();
        ms1.put("y", value3);

        // Checking again if our state ms1 is a subset of state ms
        System.out.println("________________________________________");
        System.out.println("Checking if our state ms1 is a subset of state ms: ");
        SyntaxTree C = new Analysis();// commands / code / program
        State S = C.analyse(ms1);
        if (S.subStateOf(ms)) {
            System.out.println("Is a subset");
        }
        else {
            System.out.println("Is not a subset");
    }
}
}