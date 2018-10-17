package itq.banco.org.business;

public class ClientesValidos {
	
	private String nombre;
	private String apellidos;
	private String curp;
	private String domicilio;
	private double salario;
	private double monto;
	private double tazaDeInteres;
	private double plazo;
	
	
	
	public ClientesValidos(String nombre, String apellidos, String curp, String domicilio, double salario, double monto,
			double tazaDeInteres, double plazo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curp = curp;
		this.domicilio = domicilio;
		this.salario = salario;
		this.monto = monto;
		this.tazaDeInteres = tazaDeInteres;
		this.plazo = plazo;
	}
	public ClientesValidos() {
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getTazaDeInteres() {
		return tazaDeInteres;
	}
	public void setTazaDeInteres(double tazaDeInteres) {
		this.tazaDeInteres = tazaDeInteres;
	}
	public double getPlazo() {
		return plazo;
	}
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}
	
}

