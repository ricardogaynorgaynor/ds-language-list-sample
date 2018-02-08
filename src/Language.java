
public class Language {
	
	private int id;
	private String lexicon;
	private String grammar;
	private String jargons;
	private String name;
	
	public Language() {
		this(0,"");
	}
		
	public Language(int id, String name) {
		this(id, name, "","","");
	}

	public Language(int id, String name, String lexicon, String grammar, String jargons) {
		super();
		this.id = id;
		this.lexicon = lexicon;
		this.grammar = grammar;
		this.jargons = jargons;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLexicon() {
		return lexicon;
	}

	public void setLexicon(String lexicon) {
		this.lexicon = lexicon;
	}

	public String getGrammar() {
		return grammar;
	}

	public void setGrammar(String grammar) {
		this.grammar = grammar;
	}

	public String getJargons() {
		return jargons;
	}

	public void setJargons(String jargons) {
		this.jargons = jargons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", lexicon=" + lexicon + ", grammar=" + grammar + ", jargons=" + jargons
				+ ", name=" + name + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	

}
