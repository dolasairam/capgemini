package bean;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AccountTable")
public class Account {

	private String firstName;
	private String lastName;
	private String fathersName;
	private String mothersName;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long AccountId;
	private Double amount=0.0;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userName")
	private LoginDetails login;
		
	public Account() {
		super();
	}
	
	public Account(String firstName, String lastName, String fathersName, String mothersName, Double amount,
			LoginDetails login) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.amount = amount;
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public Long getAccountId() {
		return AccountId;
	}

	public void setAccountId(Long accountId) {
		AccountId = accountId;
	}

	public LoginDetails getLogin() {
		return login;
	}

	public void setLogin(LoginDetails login) {
		this.login = login;
	}

	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
