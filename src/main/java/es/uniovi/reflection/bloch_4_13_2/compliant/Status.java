package es.uniovi.reflection.bloch_4_13_2.compliant;

// Enum pública
public enum Status {
    ACTIVE, INACTIVE;

    protected String description = "a"; // No array, no final, no static

    public String auxMethodToUseFields(){
        if(this.description.equals("a")){
            return "yes";
        }
        return "no";
    }
}
