package designPatternsDecorative;

public interface Icecream {
	public String makeIcecream();
}

class SimpleIcecream implements Icecream {
	  public String makeIcecream() {
	    return "Base Icecream";
	  }
	}