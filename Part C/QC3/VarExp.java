public class VarExp extends Exp {

	Integer value;
	
	public VarExp(Integer value) {
		this.value = value;
	}

	public Integer evaluate() {
		return value;
	}
	public String show() {
		return "" + value;
	}
}