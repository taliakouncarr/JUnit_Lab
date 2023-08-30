import junit.framework.TestCase;

public class GradeBookTester extends TestCase {

	// create new gradebook objects
	GradeBook gradeBook1 = new GradeBook(5);
	GradeBook gradeBook2 = new GradeBook(5);

	protected void setUp() throws Exception {
		super.setUp();

		// add scores
		gradeBook1.addScore(10);
		gradeBook1.addScore(35);
		gradeBook1.addScore(70);

		// add scores
		gradeBook2.addScore(50);
		gradeBook2.addScore(74);

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		gradeBook1 = null;
		gradeBook2 = null;
	}

	public void testAddScore() {
		assertTrue(gradeBook1.toString().equals("10.0 35.0 70.0"));
		assertTrue(gradeBook2.toString().equals("50.0 74.0"));
	}

	public void testSum() {
		assertEquals(115, gradeBook1.sum(), .001);
		assertEquals(124, gradeBook2.sum(), .001);
	}

	public void testMinimum() {
		assertEquals(10, gradeBook1.minimum(), .001);
		assertEquals(50, gradeBook2.minimum(), .001);
	}

	public void testFinalScore() {
		assertEquals(105, gradeBook1.finalScore(), .001);
		assertEquals(74, gradeBook2.finalScore(), .001);
	}

}
