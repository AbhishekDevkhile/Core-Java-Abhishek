package JavaTest2;

class Gear {
	String type;

	public void settype(String t) {
		this.type = t;
	}

	public String gettype() {
		return type;
	}
}

class SubEngine {
	String subenginetype;

	public void setenginetype(String seng) {
		this.subenginetype = seng;
	}

	public String getenginetype() {
		return subenginetype;
	}
}

class Engine {
	int engineid;
	int enginecleandate;
	SubEngine subeng;

	public void setengineid(int id) {
		this.engineid = id;
	}

	public void setenginecleandate(int date) {
		this.enginecleandate = date;
	}

	public void setSubEngine(SubEngine subeng) {
		this.subeng = subeng;
	}

	public int getengineid() {
		return engineid;
	}

	public int getenginecleandate() {
		return enginecleandate;
	}

	public SubEngine getSubEngine() {
		return subeng;
	}

}

public class Car1 {
	int carid;
	String carcolor;
	Engine eng;
	Gear gr;

	public void setcarid(int id) {
		this.carid = id;
	}

	public void setcarcolor(String color) {
		this.carcolor = color;
	}

	public void setEngine(Engine eng) {
		this.eng = eng;
	}

	public void setGear(Gear gr) {
		this.gr = gr;
	}

	public int getcarid() {
		return carid;
	}

	public String getcarcolor() {
		return carcolor;
	}

	public Engine getEngine() {
		return eng;
	}

	public Gear getGear() {
		return gr;
	}

	public static void main(String[] args) {

		Gear g = new Gear();
		g.settype("4 Stroke");

		SubEngine s = new SubEngine();
		s.setenginetype("4 stroke");

		Engine e = new Engine();
		e.setengineid(123);
		e.setenginecleandate(14 / 11 / 1997);
		e.setSubEngine(s);

		Car1 c = new Car1();
		c.setcarid(123);
		c.setcarcolor("Black");
		c.setEngine(e);
		c.setGear(g);

	}

}
