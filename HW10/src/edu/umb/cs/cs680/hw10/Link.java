package edu.umb.cs.cs680.hw10;


public class Link extends FSElement 
{
	FSElement ref;
	public FSElement getRef() {
		return ref;
	}


	public Link(Directory parent, String name, String owner, FSElement ref) 
	{
		
		super(parent, name, owner,0);
		this.ref = ref;
		
	}
	public void accept(FSVisitor fs) {
		fs.visit(this);
	}
}
