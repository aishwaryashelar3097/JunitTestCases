package com.aishwarya.regexpressiontest;
module junitTestCases {
	import org.junit.Test;
	public class RegExpTest{
		@Test
		public void givenFirstName_WhenProper_ShouldReturnTrue() {
			RegExp regexp = new RegExp();
			boolean result = regExp.validate_FirstName("Aishwarya");
			Assert.assertTrue(result);
		}
		
		
		public class RegExpTest{
			@Test
			public void givenLastName_WhenProper_ShouldReturnTrue() {
				RegExp regexp = new RegExp();
				boolean result = regExp.validate_LastName("Shelar");
				Assert.assertTrue(result);
			}
			
			public class RegExpTest{
				@Test
				public void givenEmail_WhenProper_ShouldReturnTrue() {
					RegExp regexp = new RegExp();
					boolean result = regExp.validate_Email("imaishwaryashelar@gmail.com");
					Assert.assertTrue(result);
				}
				
				public class RegExpTest{
					@Test
					public void givenPassword_WhenProper_ShouldReturnTrue() {
						RegExp regexp = new RegExp();
						boolean result = regExp.validate_Password("Aishwarya123");
						Assert.assertTrue(result);
					}
	}
	@Parameterized.Parameters
			public static List<String> data(){
				return Arrays.asList( 'abc@yahoo.com', 'abc-100@yahoo.com','abc123@gmail.com');
				@Test
				public void testEmailList() {
					Assertion.assertFalse(regexUserRegistration.validatePattern(testEmail))
				}
				}		
}
