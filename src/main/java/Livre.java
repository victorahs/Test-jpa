import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
	@Id
	private Integer id;

	@Column(name = "TITRE")
	private String titre;
	@Column(name = "AUTEUR")
	private String auteur;

	/**
	 * Getter
	 * 
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

	/**
	 * Setter
	 * 
	 * @param titre
	 *            the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur
	 *            the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Livre() {
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
