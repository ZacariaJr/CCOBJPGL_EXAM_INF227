interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Divisoria divisoria);
    void visit(Morayta morayta);
    void visit(Pandacan pandacan);
    void visit(Tagaytay tagaytay);
    void visit(Vito Cruz vito cruz);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}