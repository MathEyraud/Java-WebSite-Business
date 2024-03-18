package af.cmr.indyli.akdemia.business.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKDEMIA_INTER_SESSION")
public class InterSession extends Session {
	
	private static final long serialVersionUID = 8118618633104493484L;
	
    @Column(name = "MIN_PARTICIPANTS")
    private int minParticipants;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
    
    @Override
    public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public List<ParticularSubscription> getParticularSubscription() {
		return particularSubscription;
	}

	public void setParticularSubscription(List<ParticularSubscription> particularSubscription) {
		this.particularSubscription = particularSubscription;
	}

	// Constructeur par défaut
    public InterSession() {
    }

    // Constructeur avec paramètres
    public InterSession(int minParticipants) {
        super();/* passer les paramètres hérités à travers le constructeur de la classe parente */
        this.minParticipants = minParticipants;
    }

   //  Getters et Setters
    
    @OneToMany(mappedBy = "interSession", fetch = FetchType.EAGER)
	private List<ParticularSubscription> particularSubscription = new ArrayList<>();
    
    public int getMinParticipants() {
        return minParticipants;
    }

    public void setMinParticipants(int minParticipants) {
        this.minParticipants = minParticipants;
    }
}