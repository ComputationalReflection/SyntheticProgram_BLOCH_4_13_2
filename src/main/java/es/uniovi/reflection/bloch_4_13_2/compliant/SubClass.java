package es.uniovi.reflection.bloch_4_13_2.compliant;

public class SubClass extends PackagePrivateClass{
    public void publicMethod(){
        System.out.println("print");
    }

    @Override
    protected void protectedMethod(){
        System.out.println("print");
    }

    private void auxMethodToUseMethods(){
        this.protectedMethod();
        this.publicMethod();
    }
}