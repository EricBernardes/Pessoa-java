public class TestaPessoa{
	public static void main(String[] args){
		Pessoa p = new Pessoa();
		System.out.println(p.getNome());
		p.setNome("Pedro");
		System.out.println(p.getNome());
	}
}