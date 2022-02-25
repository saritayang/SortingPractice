
public class LLNode<T>{
	
	protected T info;
	protected LLNode<T> link;
	
	public LLNode(T info) {
		this.info = info;
		link = null;
	}
	
	// Returns info of this LLONode
	public T getInfo() {
		return info;
	}
	
	// Sets info of this LLNode
	public void setInfo(T info) {
		this.info = info;
	}
	
	// Returns link of this LLNode
	public LLNode<T> getLink(){
		return link;
	}
	// Sets link of this LLNode
	public void setLink(LLNode<T> link) {
		this.link = link;
	}

}
