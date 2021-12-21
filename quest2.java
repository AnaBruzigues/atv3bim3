import java.io.*;
import java.util.Scanner;

public class Quest2 {
	private String tipo;
	private int pneu;
	private String versao;
	private int acelera = 0;
	
	public Veiculo(int a, int p, String v, String tipo) { 
	    this.acelera = a;
	    this.pneu = p;
	    this.versao = v;
	    this.tipo = tipo;
	}
	
	public void Ace(int a) {
		this.acelera += a;
	}
	
	public void frear(int a) {
		this.acelera -= a;
	}
	
	public int GetAcelera() {
		return(this.acelera);
	}
	public void SetAcelera(int a) {
		this.acelera = a;
	}
	public int GetPneu() {
		return(this.pneu);
	}
	public void SetPneu(int ) {
		this.pneu = p;
	}
	public String GetTipo() {
		return(this.tipo);
	}
	public void SetTipo(String tipo) {
		this.tipo = tipo;
	}
	public String Getversao() {
		return(this.versao);
	}
	public void Setversao(String v) {
		this.versao = v;
	}

	public void printar() {
		System.out.println(this.acelera);
		System.out.println(this.pneu);
		System.out.println(this.versao);
		System.out.println(this.tipo);
	}

    public static void main(String args[]) throws IOException {
        Quest2 objeto = new Quest2();

        Scanner captar = new Scanner(System.in);
        String end = captar.nextLine();
        BufferedReader checar = new BufferedReader(new FileReader(end));

        String a = checar.readLine();
        String b = checar.readLine();
		String c = checar.readLine(); 
        String d = checar.readLine();
		objeto.pneu = Integer.parseInt(c);
		objeto.velocidadeAtual = Integer.parseInt(d);

        checar.close();
        ler.close();


    }
}