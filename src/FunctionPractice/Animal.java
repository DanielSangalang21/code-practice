package FunctionPractice;

public class Animal {
private String name;
private String   type;
private int legs;

public Animal(int legs) {
	super();
	this.legs = legs;
}

public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public Animal setType2(String type) {
	this.type = type;
	return (Dog) this;
}
}
