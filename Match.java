class Match
{
	public static void main(String args[])
	{
		String input="Shop,Mop,Hopping";
		Pattern pattern=Pattern.compile("hop");
		Matcher match=pattern.matcher(input);
		System.out.println(match.matches());
		while(matcher.find())
		{
			System.out.println(matcher.group()+" "+matcher.start()+": "+matcher.end());
		}
	}
}