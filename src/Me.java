public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if(budget >= 100){
            budget = budget - boracay.airFare;
        if(budget >= 100 ){
            System.out.println("i had a good time");
        } else{
            System.out.println("kapos budget");
        }

        checkBudget();
        }

        else {
            System.out.println("pass no money");
        }
        

        

    }

    public void visit(Divisoria divisoria) {
        if(budget >= 100){
            budget = budget - divisoria.airFare;
        if(budget >= 100){
            System.out.println("malayo pero oks lang");
        }
        else{
            System.out.println("walang pera");
        }
        checkBudget();
        }

        else {
            System.out.println("pass walang pera");
        }
        
    }

    public void visit(Morayta morayta) {
        if(budget >= 100){
            budget = budget - morayta.airFare;
        if(budget >= 100){
            System.out.println("malayo pero oks lang");
        }
        else{
            System.out.println("walang pera");
        }
        checkBudget();
        }

        else {
            System.out.println("pass walang pera");
        }
        
    }

    public void visit(Pandacan pandacan) {
        if(budget >= 100){
            budget = budget - pandacan.airFare;
        if(budget >= 100){
            System.out.println("malayo pero oks lang");
        }
        else{
            System.out.println("walang pera");
        }
        checkBudget();
        }

        else {
            System.out.println("pass walang pera");
        }
        
    }

    public void visit(Tagaytay tagaytay) {
        if(budget >= 100){
            budget = budget - tagaytay.airFare;
        if(budget >= 100){
            System.out.println("malayo pero oks lang");
        }
        else{
            System.out.println("walang pera");
        }
        checkBudget();
        }

        else {
            System.out.println("pass walang pera");
        }
        
    }

    public void visit(Vito Cruz vito cruz) {
        if(budget >= 100){
            budget = budget - vito cruz.airFare;
        if(budget >= 100){
            System.out.println("malayo pero oks lang");
        }
        else{
            System.out.println("walang pera");
        }
        checkBudget();
        }

        else {
            System.out.println("pass walang pera");
        }
        
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
