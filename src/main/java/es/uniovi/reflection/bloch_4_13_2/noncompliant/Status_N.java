package es.uniovi.reflection.bloch_4_13_2.noncompliant;

// Enum pública
public enum Status_N {
    ACTIVE, INACTIVE;

    public String description = "a"; // No array, no final, no static

    public String auxMethodToUseFields(){
        if(this.description.equals("a")){
            return "yes";
        }
        return "no";
    }
}
