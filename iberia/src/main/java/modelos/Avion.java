package modelos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="avion")
@AllArgsConstructor
public @Data class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "id_base")
	private Integer idBase;
	
	@Column(name = "idVuelo")
	private Integer idVuelo;
	
	@OneToMany(mappedBy = "avion", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
	
	private List<Vuelo> vuelos;
	
	// hibernate requiere constructor por defecto para Entity
	public Avion() {}

	public Avion(int id, String codigo, String tipo, Integer idBase, Integer idVuelo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.tipo = tipo;
		this.idBase = idBase;
		this.idVuelo = idVuelo;
	}
}

