import javax.persistence.*;

@Entity
@DiscriminatorValue(value="proffesor")
public class Proffesor extends Person{
	@Column(name="prof_id")
	private String prof_id;

	@Column(name="subject")
	private String subject;

	public void setProfId(String prof_id){
		this.prof_id = prof_id;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getProfId(){
		return this.prof_id;
	}

	public String getSubject(){
		return this.subject;
	}
}