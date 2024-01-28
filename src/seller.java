public class seller extends Staff_Information {

    private static double salesTarget;
    private static staff supervisor;


    // Constructor :
    public seller(double salesTarget, staff supervisor){
        this.salesTarget=salesTarget;
        this.supervisor=supervisor;

    }

    public double getSalesTarget() {
        return salesTarget;
    }
    public void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }



    public staff getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(staff supervisor) {
        this.supervisor = supervisor;
    }


    @Override
    public String toString() {
        return "Seller information :"+"Target : " + salesTarget + "supervisor : " +supervisor;}

}

