package beans;

public class SadFortuneService implements Fortune{
	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
