package es.uniovi.reflection.bloch_4_13_2.noncompliant;

class PackagePrivateClass_N {
    public int publicValue = 99;
    protected int protectedValue = -1;

    public void publicMethod(){
        System.out.println("print");
    }

    protected void protectedMethod(){
        System.out.println("print");
    }
}