package Entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
//@NamedQuery(name = "crearUsuario", q uery = "INSERT Usuario VALUES(0,:nombre,:apellido,:cedula,:correo,:contrasena,:tipo_usuario,:Empresa_em_id")
//@NamedQuery(name = "eliminarPorNombre", query = "DELETE FROM Producto p WHERE p.nombre = :nombre")
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String contrasena;
	private String tipo_usuario;
	@ManyToOne
	@JoinColumn
	private Empresa em_pro_id;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "us_com_id")
	private List<Compra> copras;
	
	

	
	public Usuario() {
		super();
	}

	public Usuario(int codigo, String nombre, String apellido, String cedula, String correo, String contrasena,
			String tipo_usuario, Empresa em_pro_id) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.contrasena = contrasena;
		this.tipo_usuario = tipo_usuario;
		this.em_pro_id = em_pro_id;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public Empresa getEm_pro_id() {
		return em_pro_id;
	}

	public void setEm_pro_id(Empresa em_pro_id) {
		em_pro_id = em_pro_id;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", correo=" + correo + ", contrasena=" + contrasena + ", tipo_usuario=" + tipo_usuario
				+ ", Em_pro_id=" + em_pro_id + "]";
	}
   
}

