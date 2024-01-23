package entities;

public class Student {
    private String name;
    private double nota1, nota2, nota3;

    public double somarNotas () {
        return (this.nota1 + this.nota2 + this.nota3);
    }

    public String calcularMedia () {
        if (this.somarNotas() >= 60.00) {
            return "PASS";
        } else {
            return "FAILED\n" + "MISSING " + String.format("%.2f",60 - this.somarNotas()) + " POINTS";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
}
