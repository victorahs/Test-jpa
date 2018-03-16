import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="emprunt")
public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "DATE_DEBUT")
	private LocalDateTime dateDebut;
	@Column(name = "DATE_FIN")
	private LocalDateTime dateFin;
	@Column(name = "DELAI")
	private Integer delai;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client + ", livres=" + livres + "]";
	}

	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	@ManyToMany(mappedBy="emprunts")
	private List<Livre> livres;

	public Emprunt() {

	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/** Getter
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**Setter
	 * @param livres the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	/**Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/**Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**Setter
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

}
