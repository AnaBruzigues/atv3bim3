import java.io.*;
import java.util.Scanner;

public class Quest1{ 
    private String name;
    private String father;
    private String mother;

    public Quest1(String n, String m, String f){ 
        this.name = n;
        this.father = f;
        this.mother = m; 
    }

    public Quest1(String n){
        this.name =n;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public Strin getFather() {
        return this.fater;
    }
    publi void setFather(String f) {
        this.father = f;
    }
    public String getMother() {
        return this.mother;
    }
    public void setMother(String m) {
        this.mother = m;
    }
    public void Bro(Quest1 y) {
		if(this.father == y.father || this.mother == y.mother){
			System.out.println("Irmãos");
		} else {
			System.out.println("Não irmãos");
		}
	}

    public void Pre(Quest1 y) {
		if(y.name == this.father || y.name == this.mother) {
			System.out.println("Parentes");
		} else {
			System.out.println("Não parentes");
		}
	}
	
    public static void main(String args[]) throws IOException {
        Quest1 objeto = new Quest1();

        Scanner captar = new Scanner(System.in);
        String end = captar.nextLine();
        BufferedReader checar = new BufferedReader(new FileReader(end));


        String a = checar.readLine();
        String b = checar.readLine();

        checar.close();
        captar.close();


    }

}