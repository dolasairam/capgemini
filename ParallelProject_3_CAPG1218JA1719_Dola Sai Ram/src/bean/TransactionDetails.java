package bean;

import java.sql.Timestamp;
//import java.util.Date;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

@Entity
@Table(name = "transactions")
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long accountId;
	private String type;
	private Double amount;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date time=new Timestamp(System.currentTimeMillis());
	
	public TransactionDetails() {
		super();
	}

	public TransactionDetails(Long accountId, String type, Double amount) {
		super();
		this.accountId = accountId;
		this.type = type;
		this.amount = amount;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return time;
	}

	public void setDate(Timestamp date) {
		this.time = date;
	}

	@Override
	public String toString() {
		return accountId+"\t" + type + "\t" + amount + "\t" + time+"\n";
	}
	
	
}
