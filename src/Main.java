import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		DisciplinaDAO dao = new DisciplinaDAO(); 
		ArrayList<Disciplina> lista = dao.todos(); 
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Nome da disciplina " + (i+1) + ": " + lista.get(i).getNome());
		}
	}

}
