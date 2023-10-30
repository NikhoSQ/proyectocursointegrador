package modelo;

public class Usuario {
	private int idUsuario;
	private int idRol;
	private String nombre;
	private String email;
	private String contrasena;
	
	public Usuario() {
		
	}

	public Usuario(int idUsuario, int idRol, String nombre, String email, 
			String contrasena) {
		super();
		this.idUsuario = idUsuario;
		this.idRol = idRol;
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
