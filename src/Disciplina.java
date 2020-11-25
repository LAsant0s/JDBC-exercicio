
public class Disciplina {
	private int id; 
	private String nome; 
	private String professor;
	private int periodo; 
	private String codigoSalaClassroom;
	
	public Disciplina(int id, String nome, String professor, int periodo, String codigoSalaClassroom) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.periodo = periodo;
		this.codigoSalaClassroom = codigoSalaClassroom;
	}
	
	public Disciplina() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public String getCodigoSalaClassroom() {
		return codigoSalaClassroom;
	}
	
	public void setCodigoSalaClassroom(String codigoSalaClassroom) {
		this.codigoSalaClassroom = codigoSalaClassroom;
	}
} 
