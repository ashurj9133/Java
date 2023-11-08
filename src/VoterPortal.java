public class VoterPortal{
	public void isAgeValid(int age) throws Exception{
		if(age<18) {
			throw new AgeNotValidException("you are not eligible for voting");
		}
		else if(age>18)
		{
			throw new AgeValidException("you are eligible for voting");
		}
	}
}