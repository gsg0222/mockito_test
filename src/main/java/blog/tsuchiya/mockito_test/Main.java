package blog.tsuchiya.mockito_test;

public class Main {

	public static void main(String[] args) {
		var repository = new RepositorySample();
		var service = new ServiceSample(repository);
		var returnLength = service.saveLength("test");
		System.out.println("return length : " + returnLength);
	}

}
