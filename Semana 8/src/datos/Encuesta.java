package datos;
import java.util.Properties;


public class Encuesta {
	private String usuario;
	private String sexo;
	private String email;
	private String buscador;
	private String getUsuario() {
		return usuario;
	}
	public String getSexo() {
		return sexo;
	}
	public String getBuscador() {
		return buscador;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBuscador(String buscador) {
		this.buscador = buscador;
	}
	Properties props = new Properties();
	public void almacenar() throws Exception{
		props.put("Usuario", usuario);
		props.put("Sexo", sexo);
		props.put("Email", email);
		props.put("Buscador", buscador);
	}
	
	public void imp() {
		for(Object o:props.keySet()) {
			System.out.println(props.get(o));
		}
	}
}
