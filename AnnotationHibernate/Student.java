import javax.persistence.*;

@Entity
@DiscriminatorValue(value="student")
public class Student extends Person{
	@Column(name="cllg_id")
	private String cllg_id;

	@Column(name="branch")
	private String branch;

	public void setCllgId(String cllg_id){
		this.cllg_id = cllg_id;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public String getCllgId(){
		return this.cllg_id;
	}
	public String getBranch(){
		return this.branch;
	}
}